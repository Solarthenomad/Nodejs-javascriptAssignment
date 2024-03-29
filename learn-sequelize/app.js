const express = require('express');
const path = require('path');
const morgan = require('morgan');
const nunjucks = require('nunjucks');

const {sequelize} = require('./models'); //require('./models')는 require('./models/index.js')와 같다.

const app = express();

app.set('port', process.env.PORT || 3001);
app.set('view engine', 'njk');
nunjucks.configure('views' ,{
    express : app,
    watch : true,
});


sequelize.sync({force : false}).then(() => {
    console.log('데이터베이스 연결 성공');
    //

}).catch((err) => {
    console.error(err);

});


app.use(morgan('dev'));
app.use(express.static(path.join(__dirname, 'public')));
app.use(express.json());
app.use(express.urlencoded({extended : false}));


//에러 미들웨어 -  
app.use((req, res, next) =>{
    const error = new Error('${req.method} ${req.url} 라우터가 없습니다.');
    error.status = 404;
    next(error);
});

//에러 미들웨어 - 
app.use((err, req, res, next) => {
    res.locals.message = err.message;
    res.locals.error = process.env.NODE_ENV !== 'production' ? err : {};
    res.status(err.status || 500);
    res.render('error');
})



app.listen(app.get('port') , () =>{
    console.log(app.get('port'), '번 포트에서 대기 중 ');
});

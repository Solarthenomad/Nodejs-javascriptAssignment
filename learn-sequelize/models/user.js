const Sequelize = require('sequelize');

class User extends Sequelize.Model {
    static initiate(sequelize) {
        User.init({
            name : {
                type : Sequelize.STRING(20),
                allowNull : false,
                unique : true,
            },
            age : {
                type : Sequelize.BOOLEAN,
                allowNull : true,

            },
            created_at : {
                type : Sequelize.DATE,
                allowNull : false,
                defaultValue : Sequelize.NOW,

            },
        }, {
            sequelize,
            timestamps : false,
            modelName : 'User',
            tableName : 'users',
            paranoid : false,
            charset : 'utf8',
            collate : 'utf8_general_ci'
        });
    }

    static associate(db) {}
};

module.exports = User;
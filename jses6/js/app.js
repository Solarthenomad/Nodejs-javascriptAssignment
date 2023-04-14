var name1 = {name : 'sarah'};

function change(obj){
    obj.name = "sally";
}

change(name1);
console.log(name1)



function make() {
    this.name = 'sarah';
    this.age = 21;
    this.sayHi = function() {
        console.log('My name is'+this.name);
    }
}
var student1 = new make();
var student2 = new make();


console.log(student1);
console.log(student2);
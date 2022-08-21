var a = [1,1,2,2,2];
var num = a.length;
console.log(num);

var a1 = function test(a,b){
    return a +b;
}

console.log(a1(1,3));
console.log("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

function person(){
    this.name="hhh";
};
person.prototype.name="Tony";
person.prototype.say=function() {
    console.log("hello");
};

var person1 = new person();
console.log(person1.name);




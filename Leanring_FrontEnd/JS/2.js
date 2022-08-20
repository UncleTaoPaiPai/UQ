var xd1;
xd1 = "Tony";
console.log(xd1);

function xd() {
  if (true) {
    console.log(xd1);
  }
}

xd();

var a = 3,
  b = 4.2;
console.log(Number.isInteger(b));
var c = "哈哈哈哈";
var d = "啦啦啦啦";
var e = c + d;
console.log(e);
console.log(e.length);

var f = "tony";
var g = f.slice(1, 3);
console.log(g);

var date = "2022-01-22";
console.log(date.split("-"));
var h = date.split("-");
console.log(h.join("/"));

console.log(Boolean("dsd"));
console.log(Boolean(""));
console.log(Boolean(0));
console.log(Boolean(NaN));

var aa = { aa: "1" };
var vv = Symbol("aa");
aa[aa] = "2";
console.log(aa);
console.log("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


var car = {
    color: "red",
    height: 1.8,
    suv: true,
    start : function() {
        console.log("启动++++++++++");
    },

    stop: function(){
        console.log("stop------------");
    },
}

var person={
    age: 18,
    sex: "boy",

    sayage: function(){
        console.log(this.age);
    }

};

person.hobby="eat";
delete person.sex;
person.sayage();







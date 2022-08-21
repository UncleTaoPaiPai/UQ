var list=[1,2,'str',true];
console.log(list);
console.log(list[2]);
list[5]="22222";
console.log(list);
var list2 = new Array(3,4,'str',true);
console.log(list2);
console.log("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
// 将字符串转换成数组，删除其中一个字符串
var str = '小红,小明,张三,李四';
var list = str.split(",");
console.log(list);
list.splice(3,3);
console.log(list); 

//在排好数组里，按照大小插入数据

console.log("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


for(var x =0;x<=5;x++) {

    for(var y=0;y<=x;y++) {
        document.write("*");
    }
    document.write('<br/>')
}




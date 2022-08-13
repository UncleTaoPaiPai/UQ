const a = new Map([
    ['name1','zhangsan'],
    ['name2','李四'],
    ['name3','王五'],
]);
// a.set('name1','张三');
// console.log(a);

for (let i of a.keys()){
    console.log(i);
}

for (let i of a.values()) {
    console.log(i);
}
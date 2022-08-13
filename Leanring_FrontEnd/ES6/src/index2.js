const list = [
    {hobby:'吃饭', id:1},
    {hobby:'睡觉', id:1},
    {hobby:'敲代码', id:2},
];

const list1=list.map( function (i){
    // return{
        // action:i.hobby,
    i.state=i.id===1?'喜欢':'沉迷';
    return i;
    // }
});

console.log(list)
console.log(list1)

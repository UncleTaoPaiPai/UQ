let list = [1,2,3];
let a  =list[0];
let b = list[1];
let c = list[2];

let list = [1,2,3];
let[a,b,c]=list;


console.log(a,b,c)

function xd() {
    return {
        name: 'Tony',
        list:[{url:'tony.com'},],
    }
}

// xd()

let {
    name: name1,
    list:[{url:url1}],
}=xd();

console.log(name1,url1);


const xd = '小滴课堂';
const xd1=xd.includes('小',2);
console.log(xd1);




const name ='张三';
const age = 18;
const hobbies = '打篮球';
const str1 = '我叫'+name+'今年'+age+'岁'+'爱好是：'+hobbies;
const str2 = `我叫${name}今年${age}岁爱好是${hobbies}`
console.log(str2)


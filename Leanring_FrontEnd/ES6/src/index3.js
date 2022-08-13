const a={
    aa:1,
    bb:2,
};

const b = {...a};

// console.log(b)

let name = 'Tony';
let age=18;

let obj={
    name,
    age,
    sayhello(){
        console.log('hello');
    }
}

obj.sayhello();
console.log(obj);
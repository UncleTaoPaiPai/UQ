function Factory(color,height,suv) {
    this.color=color;
    this.height=height;
    this.suv=suv;
}

// var car1= new Factory("RED",1,true);
// console.log(car1.color)
// console.log(car1)

function Car(obj){
    this.color=obj.color;
    this.height=obj.height;
    this.suv=obj.suv;
}

var audi=new Car({color: "small",height:"audi",suv:11});
console.log(audi);



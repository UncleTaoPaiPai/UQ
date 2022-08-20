function Factory(color,height,suv) {
    this.color=color;
    this.height=height;
    this.suv=suv;
}

var car1= new Factory("RED",1,true);
console.log(car1.color)
console.log(car1)

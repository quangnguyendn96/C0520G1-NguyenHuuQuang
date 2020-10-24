// interface Quang {
//     id: string;
//     title: string;
//     body: string;
// }

// let count = 50;
// if(count > 0){
//     count--;
//
// }else {
//     count = 0;
// }
// console.log(count);

// const keys = "abcdef";
// for (let idx = 0; idx < keys.length; ++idx) {
// //     console.log(keys[idx]); }
// let idx = 0;
// while (idx < keys.length) {
//     console.log(keys[idx]);
//     ++idx; }
// let idx = 0; do {
//     console.log(keys[idx]); ++idx;
// } while (idx < keys.length);

// for (const item of keys) { console.log(item);
// }
// const chuong = {
//     name: "nhung",
//     age: 55
// };
//
// for (const key in chuong) {
//     console.log(`${key}: ${chuong[key]}`);
// }

const list: number[] = [1, 2, 3];
console.log('list');
list.forEach((num) =>
    console.log(num.toFixed(4)));

const categories: Array<string> = ['Sport', 'IT', 'Car'];
const result = categories.filter(str => str.length >2);
console.log(result);

let x: [string,number];
x = ["hello",10];
console.log(x[0].substr(1));

class Shape {
    public x : number;
    public y: number;
    constructor(x: number, y:number) {
        this.x = x;
        this.y = y;
    }
    toString(): string{
        return `(x: ${this.x}, y: ${this.y})`;
    }

}
console.log(new Shape(1,2).toString());
var chuong = new Promise(function (resolve, reject) {

})

var mai = new Promise(function (resolve,reject) {

});

var connectDB = function (user, pass) {
    // @ts-ignore
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            if (user != "admin" || pass != "123") {
                return reject("username or password not correct");
            }
            else {
                return resolve("codegym.vn");
            }
        }, 2000);
    });
};
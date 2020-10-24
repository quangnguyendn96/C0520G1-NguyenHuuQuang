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
var list = [1, 2, 3];
console.log('list');
list.forEach(function (num) {
    return console.log(num.toFixed(4));
});
var categories = ['Sport', 'IT', 'Car'];
var result = categories.filter(function (str) { return str.length > 2; });
console.log(result);
var x;
x = ["hello", 10];
console.log(x[0].substr(1));
var Shape = /** @class */ (function () {
    function Shape(x, y) {
        this.x = x;
        this.y = y;
    }
    Shape.prototype.toString = function () {
        return "(x: " + this.x + ", y: " + this.y + ")";
    };
    return Shape;
}());
console.log(new Shape(1, 2).toString());
var chuong = new Promise(function (resolve, reject) {
});
var mai = new Promise(function (resolve, reject) {
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

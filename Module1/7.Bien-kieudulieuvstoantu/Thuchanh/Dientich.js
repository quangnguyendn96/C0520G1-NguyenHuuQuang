let chieudai;
let chieurong;
chieudai= prompt('Nhập chiều dài bạn ơi')
chieurong=prompt('Nhập chiều rộng bạn ơi')

let dai = parseInt(chieudai);
let rong =parseInt(chieurong);
let area = dai * rong;
document.write("Chiều dài: " + dai)
document.write('</br>')
document.write("Chiều rộng: " + rong)
document.write('</br>')
document.write("Diện tích là "+ area);
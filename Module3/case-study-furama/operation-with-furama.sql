use furama_database;
select * 
from furama_database.customer;
select * 
from furama_database.contract;
select * 
from furama_database.service;
select * 
from furama_database.service_included;
select *
from furama_database.type_service;
select *
from furama_database.contract_detail;
select *
from furama_database.type_customer;

/*Task 2*/
/*Hiển thị thông tin nhân viên bắt đầu bằng H ,T ,K*/
select * 
from furama_database.employee
where name_employee like 'H%' or name_employee like 'T%'or name_employee like 'K%';

/*Task 3*/
/*Hiển thị thông tin khách hàng có độ tuổi từ 18 đến 50 địa chỉ 'Đà Nẵng hoặc Quảng Trị'*/
select * 
from furama_database.customer
where year(day_of_birth_customer) between 1970 and 2002
having add_customer = 'Quang Tri' or add_customer = 'Da Nang';

/*Task 4*/
/*Đếm xem mỗi khách hàng đã đặt bao nhiêu lần, theo tăng dần, loại Diamond*/

select name_customer,count(name_customer) as count
from customer as cu
	inner join contract as co on cu.id_customer = co.id_customer
    inner join type_customer as ty on cu.id_type_customer = ty.id_type_customer
 where name_type_customer = 'diamond'
 group by name_customer
 order by count;   

/*Task 5*/
/*Hiển thị id khách hàng, họ tên, tên loại khách, id hợp đồng, tên dịch vụ, ngày làm hợp đồng
ngày kết thúc, tổng tiền*/
create view service_include 
 as
 select service.id_type_service, name_service
 from service
 inner join service_included on service.id_service_included = service_included.id_service_included;
select cu.id_customer, name_customer, name_type_customer, id_contract, name_service, contract_date, contract_expire
-- sum(price * unit + cost_rent) as total
from customer as cu 
inner join service as se on cu.id_customer = se.id_service_included
inner join contract as co on cu.id_customer = co.id_customer
inner join type_customer on cu.id_type_customer = se_in.id_type_customer
inner join service_included as se_in on se_in.id_service_included = se.id_service_included;


-- select id_customer, name_customer, id_contract,name_service,contract_date,contract_expire
/*Task 6
Hiển thị ID dịch vụ, tên dịch vụ, diện tích, chi phí thuê,tên loại dịch vụ mà khách hàng không sử dụng quý 1*/
select  service.id_service, area, cost_rent,area,cost_rent,name_service
from service
where service.id_service not in (
select service.id_service
from service 
	left join contract on service.id_service = contract.id_service 
	where month(contract.contract_date) <4 and year(contract.contract_date) = 2019);


/*Task 7
7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
nhưng chưa từng được Khách hàng đặt phòng trong năm 2019.*/

select * 
from contract 
where year(contract_date) = 2018 and id_service not in (
 select id_service
 from contract 
 where year(contract_date) = 2019);
 
 /*
 8.	Hiển thị thông tin Ho Ten Khach Hang có trong hệ thống, với yêu cầu Ho Ten Khach Hang không trùng nhau.
Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên */
/*Cach 1*/
select distinct *
from customer;
/*Cach 2*/
create view name_customer 
as
select name_customer
from customer
group by(name_customer);

select * 
from customer 
left join name_customer
on customer.name_customer = name_customer.name_customer;

/*9 Thực hiện thống kê doanh thu theo tháng, 
nghĩa là tương ứng với mỗi tháng trong năm 2019 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.*/
select month(contract_date) as `month` ,count(id_contract) as `amount order`
from contract
where year(contract_date) = 2019
group by (`month`);


/*10.	Hiển thị thông tin tương ứng với từng Hợp đồng thì đã sử dụng bao nhiêu Dịch vụ đi kèm. 
Kết quả hiển thị bao gồm IDHopDong, NgayLamHopDong, NgayKetthuc, TienDatCoc, 
So Luong Dich Vu Di Kem (được tính dựa trên việc count các ID Hop Dong Chi Tiet).*/
select co.id_contract, contract_date, contract_expire, deposit_money, amount
from contract as co
inner join contract_detail as con_de on co.id_contract = con_de.id_contract;


/*11.	Hiển thị thông tin các Dịch vụ đi kèm đã được sử dụng bởi những Khách hàng có 
Ten Loai Khach Hang là “Diamond” và có địa chỉ là “Vinh” hoặc “Quảng Ngãi”. */
select add_customer, name_service_included
from contract as co
inner join contract_detail as co_de on co.id_contract = co_de.id_contract
inner join customer as cu on co.id_customer = cu.id_customer
inner join type_customer as ty on ty.id_type_customer = cu.id_type_customer
inner join service_included as se_in on co_de.id_service_included = se_in.id_service_included
where name_type_customer = 'Diamond' and (add_customer = 'Quảng Ngãi' or add_customer = 'Vinh');

/*12.	Hiển thị thông tin IDHopDong, TenNhanVien, TenKhachHang, SoDienThoaiKhachHang, TenDichVu, SoLuongDichVuDikem 
(được tính dựa trên tổng Hợp đồng chi tiết), 
TienDatCoc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2019 
nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2019. */

select co.id_contract,contract_date,name_employee, name_customer, phone_customer, name_service, amount , deposit_money, contract_date
from contract as co
inner join service as se on co.id_service = se.id_service
inner join employee as em on em.id_employee = co.id_employee
inner join customer as cu on cu.id_customer = co.id_customer
inner join contract_detail as co_de on co_de.id_contract = co.id_contract
where year(contract_date) = 2019 and month(contract_date) > 9 and co.id_contract not in (
select id_contract
from contract
where month(contract_date) < 4 and year(contract_date) = 2019); 


/* 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
(Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau). */
 
 select co.id_service_included,name_service_included,price,unit,count(co.id_service_included) as count
from contract_detail as co
inner join service_included as se on co.id_service_included = se.id_service_included
group by co.id_service_included
having count =
(select count(co.id_service_included) as count
from contract_detail as co
inner join service_included as se on co.id_service_included = se.id_service_included
group by co.id_service_included
order by count desc
limit 1)
;

/*14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
Thông tin hiển thị bao gồm IDHopDong, TenLoaiDichVu, TenDichVuDiKem, SoLanSuDung */
select co.id_contract, name_service, name_service_included
from service as se 
left join contract as co on co.id_service = se.id_service
inner join type_service as ty on ty.id_type_servicess = se.id_type_service
inner join contract_detail as co_de on co.id_contract= co_de.id_contract
inner join service_included as se_in on se_in.id_service_included = co_de.id_service_included;



/*15.	Hiển thi thông tin của tất cả nhân viên bao gồm 
IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai, DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.
*/
select em.id_employee, name_employee, em.id_department, phone_number, address_employee, count(em.id_employee) as total_contract
from employee as em
inner join contract as co on em.id_employee = co.id_employee
where year(contract_date) between 2018 and 2019
group by id_employee
having total_contract <4;

/*16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2017 đến năm 2019. */
delete from
employee 

/*17.	Cập nhật thông tin những khách hàng có TenLoaiKhachHang từ  Platinium lên Diamond, 
chỉ cập nhật những khách hàng đã từng đặt phòng với tổng Tiền thanh toán trong năm 2019 là lớn hơn 10.000.000 VNĐ.
*/

update customer
	set id_type_customer = 0001
	where id_customer =
(select cu.id_customer 
from customer as cu
left join contract as co on cu.id_customer = co.id_customer
where year(contract_date) =2019 and total_money > 4000 and id_type_customer = 0002);

/*
18.	Xóa những khách hàng có hợp đồng trước năm 2016 (chú ý ràng buộc giữa các bảng).*/

delete 
from customer
inner join contract on customer.id_customer = contract.id_customer
where year(contract_date) < 2018;

/*19.	Cập nhật giá cho các Dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2019 lên gấp đôi.*/

20.	Hiển thị thông tin của tất cả các Nhân viên và Khách hàng có trong hệ thống, thông tin hiển thị bao gồm ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi. */


use furama_database;
select * 
from furama_database.customer;
select * 
from furama_database.contract;
select * 
from furama_database.service;
select * 
from furama_database.service_included;
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
/*Đếm xem khách hàng đã đặt bao nhiêu lần, theo tăng dần, loại Diamond*/

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
-- select id_customer, name_customer, id_contract,name_service,contract_date,contract_expire

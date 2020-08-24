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
-- select id_customer, name_customer, id_contract,name_service,contract_date,contract_expire
/*Task 6
Hiển thị ID dịch vụ, tên dịch vụ, diện tích, chi phí thuê,tên loại dịch vụ mà khách hàng không sử dụng quý 1*/
select  name_service, area, cost_rent,name_type_service
from service
		inner join type_service on service.id_type_service = type_service.id_type_service
    	inner join contract on contract.id_service = service.id_service
where month(contract_date) < 4;

/*Task 7
7.	Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa, ChiPhiThue, TenLoaiDichVu 
của tất cả các loại dịch vụ đã từng được Khách hàng đặt phòng trong năm 2018 
nhưng chưa từng được Khách hàng đặt phòng trong năm 2019.*/

-- select name_service, area,maximum_customer,cost_rent,name_type_service,contract_date


create view task7 
as
select co.id_service ,name_service, area,maximum_customer,cost_rent,name_type_service,contract_date
from service as ser
	inner join type_service as ty on ser.id_type_service = ty.id_type_servicess
    inner join contract as co on co.id_service = ser.id_service
    where year(contract_date) = 2018;
drop view task7;
select *
from task7;

create view task8
as
select co.id_service ,name_service, area,maximum_customer,cost_rent,name_type_service,contract_date
from service as ser
	inner join type_service as ty on ser.id_type_service = ty.id_type_servicess
    inner join contract as co on co.id_service = ser.id_service
    where year(contract_date) = 2019;

create view task78
as
	select task7.id_service ,task7.name_service, task7.area,task7.maximum_customer,task7.cost_rent,task7.name_type_service,task7.contract_date
	from task7
	left join task8 on task7.id_service = task8.id_service;

select id_service,name_service,area,maximum_customer,cost_rent,name_type_service
from task78
group by (id_service)
having count(id_service) = 1;

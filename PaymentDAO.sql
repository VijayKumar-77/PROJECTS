create database vijay;

use vijay;

create table Register_Details(
Register_Name    varchar(50),
Phone_Num        varchar(15),
Email            varchar(25),
DOB              date,
Password         varchar(10)
);
-- drop table Register_Details;

select * from Register_Details;

Select Register_Name, Password from Register_Details;

alter table Register_Details add Currwalletbal double not null default '0';

alter table Register_Details add Address varchar(50) not null;

alter table Register_Details add User_ID int primary key auto_increment not null;

alter table Register_Details modify column Phone_Num bigint unique not null;

set sql_safe_updates = 0;
set sql_safe_updates = 1;

-- delete from Register_Details;
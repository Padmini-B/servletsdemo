use admin;
create table students(Id int,Firstname varchar(20),Lastname varchar(20),Class varchar(20),Section varchar(20),Email varchar(50),Age int);
insert into students values(127,'Venkata Padmini','Bollineni','B.tech','A','padmini@gmail.com',21);
insert into students values(161,'Naga Praneetha','Naradasu','B.tech','A','praneetha@gmail.com',21);
insert into students values(159,'Bhavitha','N','B.tech','A','bhavitha@gmail.com',21);
select * from classes;
insert into subjects values(106,'Software Engineering','SE');
insert into subjects values(302,'Department Elective','DE');
insert into subjects values(201,'Operating Systems','OS');
insert into subjects values(129,'JAVA','OOPS','I');
delete from subjects where shortcut='SE';
insert into teachers values(3057,'Amar','Jukuntla',35);
insert into teachers values(1056,'Jyostna','Boddapti',40);
insert into teachers values(2806,'Nirupama','Bhatt',35);
insert into teachers values(007,'Phani','Sistla',35);


create table Employee
(
	employee_id serial not null,
	role_id int not null references roles(role_id),
	username varchar (50) not null unique,
	pass varchar(50) not null unique,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	email_address varchar(50) not null,
	reimbursment_amount integer default 1000  not null,
	
	
	--constraint pk_username 
	primary key (employee_id)
	
);
insert into Employee(employee_id, role_id, username, pass, first_name, last_name, email_address, reimbursment_amount) 
VALUES (default, 1, 'tg589', 'tigers', 'Terry', 'Golden', 'tg76@yahoo.com', default)

insert into Employee(employee_id, role_id, username, pass, first_name, last_name, email_address, reimbursment_amount) 
VALUES (default, 2, 'rb929', 'reap', 'Robyn', 'Fenty', 'rb91@yahoo.com', default)

insert into Employee(employee_id, role_id, username, pass, first_name, last_name, email_address, reimbursment_amount) 
VALUES (default, 3, 'af345', 'flamingo', 'Adrian', 'Foster', 'af29@yahoo.com', default)

insert into Employee(employee_id, role_id, username, pass, first_name, last_name, email_address, reimbursment_amount) 
VALUES (default, 4, 'Kira', 'newworld', 'Light', 'Yagami', 'shinigami@yahoo.com', default)
select * from Employee
drop table Employee;

select * from Request;

create table roles 
(
	role_id int not null primary key,
	role_name varchar(50) 

);
insert into roles(role_id, role_name) values (1, 'Employee');
insert into roles(role_id, role_name) values (2, 'Direct Supervisor');
insert into roles(role_id, role_name) values (3, 'Department Head');
insert into roles(role_id, role_name) values (4, 'Benefits Coordinator');

select * from roles;
drop table roles;

create table Request
(
	request_id serial not null,
	employee_id serial references employee(employee_id),
	event_type varchar (100) not null,
	address	varchar (50) not null,
	city varchar (50) not null,
	state varchar (50) not null,
	zip varchar(50) not null,
	event_time varchar (50) not null,
	event_date varchar (50) not null,
	event_cost varchar (50) not null,
	grading_format varchar(50) not null,
	status integer not null references request_status(status),
	time_of_request timestamp default current_timestamp,
	grade varchar(50) not null ,
	
	primary key (request_id)
);
select * from Request;
drop table Request;

create table request_status
(
	status integer not null primary key,
	status_name varchar (100)
);
insert into request_status (status, status_name) values (1, 'Pending Direct Supervisor Approval'); 
insert into request_status (status, status_name) values (2, 'Pending Department Head Approval'); 
insert into request_status (status, status_name) values (3, 'Pending Benefits Coordinator'); 
insert into request_status (status, status_name) values (4, 'Graded, Pending Benefits Coordinator Approval'); 
select * from request_status
drop table request_status;

select * from employee inner join request on employee.employee_id = request.employee_id inner join request_status on request.status = request_status.status
CREATE TABLE employee(
id varchar2(8),
name varchar2(15),
position varchar2(15)
)

drop table employee

alter table employee add constraint pk_employee_id primary key(id)

select *from employee

CREATE TABLE attendee(
id varchar2(8),
name varchar2(15),
intime varchar2(30),
exittime varchar2(30)
)

alter table attendee add constraint pk_attendee_id primary key(id)
alter table attendee add constraint fk_attendee_id foreign key(id)
references employee(id)

drop table attendee

insert into attendee (id,name) values ('00000001' , 'kim')

select *from attendee

commit

CREATE TABLE menu2(
fullname varchar2(100) primary key
)

insert into menu2 values ('com.naver.InsertCommand')
insert into menu2 values ('com.naver.SelectCommand')
insert into menu2 values ('com.naver.UpdateCommand')
insert into menu2 values ('com.naver.DeleteCommand')
insert into menu2 values ('com.naver.EndCommand')
insert into menu2 values ('com.naver.SelectByIdCommand')


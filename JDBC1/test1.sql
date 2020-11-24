CREATE TABLE member2(
id varchar2(6),
name varchar2(6),
age number(3)
)
alter table member2 add constraint pk_member2_id primary key(id)
�⺻Ű�� �����ϸ�, �⺻Ű�� ���� �ߺ��� ������� �ʴ´�. (unique constraint)
�⺻Ű�� �����ϸ�, �⺻Ű�� ���� not null ���������� �߰��ȴ�.

INSERT INTO member2 VALUES ('m001', 'kim' , 30)
INSERT INTO member2 VALUES ('m002', 'kim' , 30)
INSERT INTO member2 VALUES ('m003', 'kim' , 30)
INSERT INTO member2 VALUES ('m004', 'kim' , 30)
INSERT INTO member2 VALUES ('m005', 'kim' , 30)
INSERT INTO member2 VALUES ('m006', 'kim' , 30)
INSERT INTO member2 VALUES ('m007', 'kim' , 30)

insert into member2 (id, name, age) values ('m008','lee', 44)

commit

select *from member2 where id = 'm004'

select *from member
alter table member add constraint pk_member_id primary key(mid)

CREATE TABLE test2(
id varchar2(6) primary key,
age number(3)
)
CREATE TABLE test3(
id varchar2(6),
age number(3),
constraint pk_test3_id primary key(id)
)

delete from member2
commit




=========================================================================================================

CREATE TABLE depart(
edep varchar2(10)
)
alter table depart add constraint pk_depart_edep primary key(edep)

alter table employee1 add constraint fk_employee1_edep foreign key(edep)
references depart(edep)

insert into depart values ('�λ��')
insert into depart values ('ȫ����')
insert into depart values ('������')
insert into depart values ('������')


�ǰ���� ���̺�
CREATE TABLE employee1(
eid varchar2(10),
ename varchar2(10),
edep varchar2(10)
)

insert into employee1 (eid, ename, edep) values ('e001', 'kim', '�λ��')
insert into employee1 (eid, ename, edep) values ('e002', 'kim', 'ȫ����')
insert into employee1 (eid, ename, edep) values ('e003', 'kim', '������')
insert into employee1 (eid, ename, edep) values ('e004', 'kim', '������')
insert into employee1 (eid, ename, edep) values ('e004', 'kim', '�񼭽�')

alter table employee1 add constraint pk_employee1_eid primary key(eid)
commit

insert into employee1(eid, ename) values ('e006', 'kim')
select *from employee1
===================================================

create table menu(
mn varchar2(20)
)
alter table menu add constraint pk_menu_mn primary key(mn)

alter table rastorant add constraint fk_rastorant_menu foreign key(menu)
references menu(mn)

insert into menu values ('��ġ�')
insert into menu values ('�����')
insert into menu values ('���κ��')
insert into menu values ('�������')


create table rastorant(
id varchar2(6),
name varchar2(6),
menu varchar2(20)
)
alter table rastorant add constraint pk_rastorant_id primary key(id)

insert into rastorant values ('p1', 'kim' , '��ġ�')
insert into rastorant values ('p2', 'kim' , '�����')
insert into rastorant values ('p3', 'kim' , '���κ��')
insert into rastorant values ('p4', 'kim' , '�������')
insert into rastorant values ('p5', 'kim' , '�Ľ�Ÿ')

select *from rastorant

================================================================
create table cham(
ch varchar2(20)
)
alter table cham add constraint pk_cham_ch primary key(ch)

alter table lol add constraint fk_lol_cham foreign key(cham)
references cham(ch)

insert into cham values ('�Ƹ�')
insert into cham values ('Ƽ��')
insert into cham values ('����')
insert into cham values ('����')

create table lol(
player varchar2(6),
cham varchar2(20)
)
alter table lol add constraint pk_lol_player primary key(player)

insert into lol values ('kim', '�Ƹ�')
insert into lol values ('park', '����')
insert into lol values ('lee', 'Ƽ��')
insert into lol values ('cho', '����')
insert into lol values ('kang', '����')

select *from lol
select *from member




















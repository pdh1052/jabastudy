CREATE TABLE member10(
mid varchar2(6),
point number
)
alter table member10 add constraint pk_member10_mid primary key(mid)

insert into member10 values ('p001',0)
insert into member10 values ('p002',0)
insert into member10 values ('p003',0)

select *from member10
commit

CREATE TABLE oder(
oid varchar2(10),
menu varchar2(20),
mid varchar2(10)
)
alter table oder add constraint pk_oder_oid primary key(oid)

insert into oder values ('f1','±¹¼ö','mid1')
insert into oder values ('f2','¹ä','mid2')
insert into oder values ('f3','»§','mid3')

select *from oder
commit
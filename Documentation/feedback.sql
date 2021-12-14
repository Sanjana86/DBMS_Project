create database fbform;
use fbform;
create table login_s(name varchar(40), rollno char(10) , email varchar(40),password varchar(50), primary key(rollno));

alter table login_s add constraint minimo check (length(password)>=8);

alter table login_s add constraint maximo check (length(rollno)=10);

create table login_p(pname varchar(40), pid char(5) ,pemail varchar(40),ppassword varchar(50), primary key(pid));

alter table login_p add constraint mini check(length(ppassword)>=8);

alter table login_p add constraint maxima check(length(pid)=5);

alter table login_s add user_id varchar(40) after name;

select user_id from login_s where password=?;

create table subject(semester int, code char(6),sub_name varchar(50),  credits int, prof_id char(5), primary key(code));

create table form(s_id char(10),sub_code char(6));

alter table form add q1 int check(q1 in (1,2,3,4,5)) after sub_code;

alter table form add q2 int check(q2 in (1,2,3,4,5)) after q1;

alter table form add q3 int check(q3 in (1,2,3,4,5)) after q2;

alter table form add q4  int check(q4 in (1,2,3,4,5)) after q3;

create table display(prof_id char(6), sub_code char(6), q1_avg float, q2_avg float, q3_avg float,q4_avg float);


insert into login_p values('Alex','MU503','alex503@muedu.ac.in','Alex@503');
insert into login_p values('Erica','MU504','erica504@muedu.ac.in','Erica@504');
insert into login_p values('Kate','MU505','kate505@muedu.ac.in','Katie@505');
insert into login_p values('Peter','MU506','peter506@muedu.ac.in','Peter@506'); 


insert into subject values(5, 'CS 314','Programming Workshop',1,'MU504');
insert into subject values(5, 'CS 308','Database Management Systems',4,'MU504');
insert into subject values(5, 'CS 309','Microprocessors and Interfacing',3,'MU503');
insert into subject values(5, 'CS 306','Principles of Programming Languages',2,'MU506');
insert into subject values(5, 'CS 306','Operating Systems',4,'MU505');


insert into form values('19XJ1A0575','CS 306',5,2,4,3);
insert into form values('19XJ1A0575','CS 307',3,5,4,2);
insert into form values('19XJ1A0575','CS 308',5,4,3,4);
insert into form values('19XJ1A0575','CS 309',3,4,3,2);
insert into form values('19XJ1A0575','CS 314',3,5,4,4);
insert into form values('19XJ1A0561','CS 306',5,5,4,1);
insert into form values('19XJ1A0561','CS 307',5,5,3,2);
insert into form values('19XJ1A0561','CS 308',4,4,4,3);
insert into form values('19XJ1A0561','CS 309',3,4,5,3);
insert into form values('19XJ1A0561','CS 314',4,5,4,3);
insert into form values('19XJ1A0541','CS 306',3,4,5,4);
insert into form values('19XJ1A0541','CS 307',4,3,4,5);
insert into form values('19XJ1A0541','CS 308',3,4,5,5);
insert into form values('19XJ1A0541','CS 309',3,4,4,3);
insert into form values('19XJ1A0541','CS 314',5,4,5,1);
insert into form values('19XJ1A0501','CS 314',1,2,3,3);
insert into form values('19XJ1A0501','CS 309',2,2,3,5);
insert into form values('19XJ1A0501','CS 308',5,1,2,2);
insert into form values('19XJ1A0501','CS 307',5,3,2,3);
insert into form values('19XJ1A0501','CS 306',5,4,3,1);


insert into display(sub_code,q1_avg,q2_avg,q3_avg) select sub_code,avg(q1),avg(q2),avg(q3) from form where sub_code = 'CS 314';
insert into display(sub_code,q1_avg,q2_avg,q3_avg) select sub_code,avg(q1),avg(q2),avg(q3) from form where sub_code = 'CS 306';
insert into display(sub_code,q1_avg,q2_avg,q3_avg) select sub_code,avg(q1),avg(q2),avg(q3) from form where sub_code = 'CS 307';
insert into display(sub_code,q1_avg,q2_avg,q3_avg) select sub_code,avg(q1),avg(q2),avg(q3) from form where sub_code = 'CS 308';
insert into display(sub_code,q1_avg,q2_avg,q3_avg) select sub_code,avg(q1),avg(q2),avg(q3) from form where sub_code = 'CS 309';


update display set prof_id = 'MU 506' where sub_code = 'CS 306';
update display set prof_id = 'MU 505' where sub_code = 'CS 307';
update display set prof_id = 'MU 504' where sub_code = 'CS 308';
update display set prof_id = 'MU 504' where sub_code = 'CS 314';
update display set prof_id = 'MU 503' where sub_code = 'CS 309';


update display set q4_avg = (select avg(q4) from form where sub_code = 'CS 314') where sub_code = 'CS 314';
update display set q3_avg = (select avg(q3) from form where sub_code = 'CS 314') where sub_code = 'CS 314';
update display set q2_avg = (select avg(q2) from form where sub_code = 'CS 314') where sub_code = 'CS 314';
update display set q1_avg = (select avg(q1) from form where sub_code = 'CS 314') where sub_code = 'CS 314';
update display set q4_avg = (select avg(q4) from form where sub_code = 'CS 309') where sub_code = 'CS 309';
update display set q3_avg = (select avg(q3) from form where sub_code = 'CS 309') where sub_code = 'CS 309';
update display set q2_avg = (select avg(q2) from form where sub_code = 'CS 309') where sub_code = 'CS 309';
update display set q1_avg = (select avg(q1) from form where sub_code = 'CS 309') where sub_code = 'CS 309';
update display set q4_avg = (select avg(q4) from form where sub_code = 'CS 308') where sub_code = 'CS 308';
update display set q3_avg = (select avg(q3) from form where sub_code = 'CS 308') where sub_code = 'CS 308';
update display set q2_avg = (select avg(q2) from form where sub_code = 'CS 308') where sub_code = 'CS 308';
update display set q1_avg = (select avg(q1) from form where sub_code = 'CS 308') where sub_code = 'CS 308';
update display set q4_avg = (select avg(q4) from form where sub_code = 'CS 307') where sub_code = 'CS 307';
update display set q3_avg = (select avg(q3) from form where sub_code = 'CS 307') where sub_code = 'CS 307';
update display set q2_avg = (select avg(q2) from form where sub_code = 'CS 307') where sub_code = 'CS 307';
update display set q1_avg = (select avg(q1) from form where sub_code = 'CS 307') where sub_code = 'CS 307';
update display set q4_avg = (select avg(q4) from form where sub_code = 'CS 306') where sub_code = 'CS 306';
update display set q3_avg = (select avg(q3) from form where sub_code = 'CS 306') where sub_code = 'CS 306';
update display set q2_avg = (select avg(q2) from form where sub_code = 'CS 306') where sub_code = 'CS 306';
update display set q1_avg = (select avg(q1) from form where sub_code = 'CS 306') where sub_code = 'CS 306';

select code from subject where prof_id = ?;

Flats(flatno,bldgname,rooms,ownerid) 
Customer(cno,cname,address,flatno) 
Owner(ownerid,oname,mobile)


CREATE TABLE FLATS (
    FLATNO int primary key,
    BLDGNAME varchar(20) not null,
    ROOMS int,
    OWNERID int not null,
    constraint OWNERID foreign key (OWNERID)
    references owner(ownerid)
    on update cascade 
    on delete cascade
);


CREATE TABLE CUSTOMER ( 
    CNO int primary key,
    CNAME varchar(20) not null,
    ADDRS varchar(20), 
    FLATNO int,
    constraint FLATNO  foreign key (FLATNO) 
    references FLATS(FLATNO)
    on update cascade 
    on delete cascade
);

CREATE TABLE OWNER (
OWNERID int primary key,
ONAME varchar(20),
MOBILE numeric(10,0)

);


insert into owner 
values 
    (1001, 'rushi',5620),
    (1002, 'akshay',7778),
    (1003, 'shivam',5399),
    (1004, 'tanmay',1125),
    (1005, 'ganesh',1155),
    (1006, 'harshal',7961); 

insert into flats 
values 
    (1100, 'Sai Nandan Van' , 3, 1003),
    (1200, 'Sarthak homes', 4 ,1002),
    (1300, 'Aishirwad',5,1002),
    (1400, 'BatCave',69,1003),
    (1500, 'IACSD',30,1001);

insert into Customer 
values 
    (101, 'Shyam' , 'Parbhani', 1100),
    (102, 'Ram' , 'Ayodhya', 1200),
    (103, 'Ghanshyam' , 'Bihar', 1100),
    (104, 'Barry Allen' , 'Star City', 1200),
    (105, 'Hrushikesh' , 'Wadgoan Sheri', 1100),
    (106, 'Sonali' , 'kolhapur', 1200),
    (107, 'Shravani' , 'Shaniwar Wadi', 1400),
    (108, 'Deepashu' , 'Basunagar', 1300),
    (109, 'Bruce' , 'Wayne', 1400);

system cls

select * from owner;
select * from flats;
select * from customer;

List all customers along with flatno and building name?

select * from flats f
    inner join owner o
        on f.ownerid = o.ownerid
    inner join customer c
        on c.flatno = f.flatno;

select * from flats f
    outer join owner o
        on f.ownerid = o.ownerid
    outer join customer c
        on c.flatno = f.flatno;




SELECT * FROM flats f
LEFT JOIN t2 ON t1.id = t2.id
UNION ALL
    SELECT * FROM t1
RIGHT JOIN t2 ON t1.id = t2.id
WHERE t1.id IS NULL

select * from flats f
    full join owner o
        on f.ownerid = o.ownerid
    full join customer c
        on c.flatno = f.flatno
    where
        f.ownerid is null or 
        o.ownerid is null or 
        c.flatno is null ;




======================================================================================================

Faculty (fid, fname,address) 
Course(cid, cname,duration days) 
Course-faculty(cid,fid,date_of_assignment)

CREATE TABLE Faculty (
    fid int primary key,
    fname varchar(20) not null,
    ADDRS varchar(20)
);


CREATE TABLE Course ( 
    cid int primary key,
    cname varchar(20) not null,
    duration int not null,
    
);

CREATE TABLE Course_faculty (
cid int not null,
fid int not null,
date_of_assignment date,
primary key(cid,fid),
constraint cid_fk foreign key(cid) references Course(cid)
on update cascade
on delete cascade,

constraint fid_fk foreign key(fid) references Faculty(fid)
on update cascade
on delete cascade
);



desc Course;
desc Course_faculty;
desc faculty;


insert into Course 
values 
    (1001, 'COP',15),
    (1002, 'OS',60),
    (1003, 'GK',8),
    (1004, 'OOPS',65),
    (1005, 'DBMS',25),
    (1006, 'Aptitude',5); 

insert into Course_faculty 
values 
    (1001, 101, '2022-09-15');

insert into faculty 
values 
    (101, 'Mr. Shyam' , 'Parbhani'),
    (102, 'Mr. Ram' , 'Ayodhya'),
    (103, 'Mr. Ghanshyam' , 'Bihar'),
    (104, 'Mr. Barry Allen' , 'Star City'),
    (105, 'Mr. Hrushikesh' , 'Wadgoan Sheri'),
    (106, 'Mrs. Sonali' , 'kolhapur'),
    (107, 'Mrs. Shravani' , 'Shaniwar Wadi'),
    (108, 'Mrs. Deepashu' , 'Basunagar'),
    (109, 'Mr. Bruce' , 'Wayne');

system cls

drop database if exists `testDB`;
create database `testDB`;

create table testDB.Person(
    person_id int not null auto_increment,
    username varchar(50),
    password varchar(50),
    primary key(person_id)
);

create table testdb.Person_info(
    person_id int not null,
    info_id int not null auto_increment,
    name varchar(100),
    age int,
    role varchar(50),
    primary key(info_id),
    foreign key(person_id) references testDB.Person(person_id)
);

create table testDB.Class(
    info_id int not null,
    class_id int not null auto_increment,
    class varchar(25),
    class_grade int,
    primary key(class_id),
    foreign key(info_id) references testDB.Person_info(info_id)
);

create table testDB.Tests(
    class_id int not null,
    test_id int not null auto_increment,
    chapter varchar(50),
    test_grade int,
    primary key(test_id),
    foreign key(class_id) references testDB.Class(class_id)
);

insert into testDB.Person (username, password) 
	VALUES ("human one","one");
    
insert into testDB.Person (username, password) 
	VALUES ("human two","two");
    
insert into testDB.Person (username, password) 
	VALUES ("human three","three");
    
insert into testDB.Person (username, password) 
	VALUES ("human four","four");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (1,"human one",20, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (2,"human two",17, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (3,"human three",21, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (4,"human four",22, "teacher");
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (1,"Anatomy 101",85);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (2,"CS 2000",95);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (2,"CS 2020",75);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (3,"STAT 2909",81);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (4,"0",0);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (1,"First",55);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (2,"First",98);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (2,"Second",82);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (3,"First",78);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (4,"First",68);

insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (4,"Second",65);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (5,"0",0);

select p.person_id, p.username, i.name, i.age, i.role, c.class, c.class_grade, t.chapter, t.test_grade
from testDB.Person  p
    join testDB.Person_info i
        on p.person_id = i.person_id
    join testDB.Class c
        on i.info_id = c.info_id
    join testDB.Tests t
        on c.class_id = t.class_id

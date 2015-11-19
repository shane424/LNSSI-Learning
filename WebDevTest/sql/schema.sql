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
	VALUES ("maryp","Poppins");
    
insert into testDB.Person (username, password) 
	VALUES ("jWall","theWall");
    
insert into testDB.Person (username, password) 
	VALUES ("Stree","ScreeScree");
    
insert into testDB.Person (username, password) 
	VALUES ("JKL","JKHa");
    
insert into testDB.Person (username, password) 
	VALUES ("Zaw","ZZQee");
    
insert into testDB.Person (username, password) 
	VALUES ("LL","DoubleL");
    
insert into testDB.Person (username, password) 
	VALUES ("Munt","theHunt");
    
insert into testDB.Person (username, password) 
	VALUES ("Ucher","Foocher");
    
insert into testDB.Person (username, password) 
	VALUES ("PBruh","fightMe");
    
insert into testDB.Person (username, password) 
	VALUES ("Schast","Chastain");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (1,"Mary Pol",20, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (2,"John Wall",17, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (3,"Stiles Ree",21, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (4,"Jell Kall",22,"teacher");

insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (5,"Michael Waz",20, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (6,"Lorry Lue",17, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (7,"Miles Hunt",21, "student");

insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (8,"Urei Cher",20, "teacher");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (9,"Purht Brua",17, "student");
    
insert into testDB.Person_info (person_id, name, age, role) 
	VALUES (10,"Sam Chast",21, "student");
    
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
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (5,"Anatomy 101",85);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (5,"CS 2000",35);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (6,"CS 2020",55);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (7,"STAT 2909",89);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (7,"STAT 2909",100);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (8,"0",0);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (9,"CS 2000",98);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (9,"CS 2020",99);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (9,"STAT 2909",95);
    
insert into testDB.Class (info_id, class, class_grade) 
	VALUES (10,"STAT 2909",74);
    
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

insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (6,"First",75);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (7,"Second",92);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (8,"Third",92);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (9,"Second",88);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (10,"Third",78);

insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (11,"0",0);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (12,"First",99);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (13,"First",85);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (14,"First",79);
    
insert into testDB.Tests (class_id, chapter, test_grade) 
	VALUES (15,"Second",89);

select * from testDB.Person;
select * from testDB.Person_info;
select * from testDB.Class;
select * from testDB.Tests;

select p.username, p.password, i.name, i.age, i.role, c.class, c.class_grade, t.chapter, t.test_grade
from testDB.Person  p
    join testDB.Person_info i
        on p.person_id = i.person_id
    join testDB.Class c
        on i.info_id = c.info_id
    join testDB.Tests t
        on c.class_id = t.class_id

Lab 5 Question=>
Lab 1: Use the Student management system Database and table from our previous lab and write a sql query to achieve the below scenario. 

 Assume you are managing a university database that tracks student enrollments in various courses. You have two tables, "Student" and "Enrollment". The goal is to retrieve information about each student's ID, first name, last name, and their enrollment details, including the enrollment ID and the associated course ID. 

 Hint:Use inner join to retrieve data. Submission: Create an SQL script file containing your solutions for all tasks (queries). Name the file "lab_assignment1.sql" Provide comments above each query to indicate the query's purpose





mysql> show databases;
+-----------------------------------+
| Database                          |
+-----------------------------------+
| employee_db                       |
| information_schema                |
| joins_db                          |
| mysql                             |
| online_management_system          |
| online_shopping_management_system |
| performance_schema                |
| student_db                        |
| sys                               |
+-----------------------------------+
9 rows in set (0.23 sec)

mysql> create database student_management_db;
Query OK, 1 row affected (0.09 sec)

mysql> show databases;
+-----------------------------------+
| Database                          |
+-----------------------------------+
| employee_db                       |
| information_schema                |
| joins_db                          |
| mysql                             |
| online_management_system          |
| online_shopping_management_system |
| performance_schema                |
| student_db                        |
| student_management_db             |
| sys                               |
+-----------------------------------+
10 rows in set (0.00 sec)

mysql> use student_management_db;
Database changed
mysql> create table student(student_id int primary key , first_name varchar(20) not null , last_name varchar(20) not null, email varchar(20) not null,department varchar(20) not null);
Query OK, 0 rows affected (0.09 sec)

mysql> desc student;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| student_id | int         | NO   | PRI | NULL    |       |
| first_name | varchar(20) | NO   |     | NULL    |       |
| last_name  | varchar(20) | NO   |     | NULL    |       |
| email      | varchar(20) | NO   |     | NULL    |       |
| department | varchar(20) | NO   |     | NULL    |       |
+------------+-------------+------+-----+---------+-------+
5 rows in set (0.04 sec)

mysql> insert into student values(1,'sandesh','ghorpade','sandeshghorpade0@gmail.com','it'),(2,'aniruddha','keskar','aniruddhakeaskar1@gmail.com','it'),(3,'tina','singh','tina@gmail.com','bcom'),(4,'janvi','yadav','janvi@gmail.com','comps');
Query OK, 4 rows affected (0.02 sec)
Records: 4  Duplicates: 0  Warnings: 0

mysql> select * from student;
+------------+------------+-----------+----------------------------+------------+
| student_id | first_name | last_name | email                      | department |
+------------+------------+-----------+--------------------+--------------------+
|          1 | sandesh    | ghorpade  | sandeshghorpade0@gmail.com | it         |
|          2 | aniruddha  | keskar    | aniruddhakeskar1@gmail.com | it         |
|          3 | tina       | singh     | tina@gmail.com             | bcom       |
|          4 | janvi      | yadav     | janvi@gmail.com            | comps      |
+------------+------------+-----------+----------------------------+------------+
4 rows in set (0.00 sec)

mysql> create table enrollment(enrollment_id int primary key ,student_id int , course_id varchar(20) not null , enrollment_date date not null, foreign key(student_id) references student(student_id));
Query OK, 0 rows affected (0.03 sec)

mysql> insert into enrollment values(101,1,'c101','2/10/25'),(102,2,'c102','3/10/25'),(103,2,'e101','7/12/25'),(104,1,'r101','7/3/25');
Query OK, 4 rows affected, 4 warnings (0.01 sec)
Records: 4  Duplicates: 0  Warnings: 4

mysql> select * from enrollment;;
+---------------+------------+-----------+-----------------+
| enrollment_id | student_id | course_id | enrollment_date |
+---------------+------------+-----------+-----------------+
|           101 |          1 | c101      | 0002-10-25      |
|           102 |          2 | c102      | 0003-10-25      |
|           103 |          2 | e101      | 0007-12-25      |
|           104 |          1 | r101      | 0007-03-25      |
+---------------+------------+-----------+-----------------+
4 rows in set (0.00 sec)

mysql> show tables;
+---------------------------------+
| Tables_in_student_management_db |
+---------------------------------+
| enrollment                      |
| student                         |
+---------------------------------+
2 rows in set (0.00 sec)

mysql> select s.student_id,s.first_name,s.last_name,e.enrollment_id,e.course_id from student s inner join enrollment e on s.student_id = e.student_id;
+------------+------------+-----------+---------------+-----------+
| student_id | first_name | last_name | enrollment_id | course_id |
+------------+------------+-----------+---------------+-----------+
|          1 | sandesh    | ghorpade  |           101 | c101      |
|          1 | sandesh    | ghorpade  |           104 | r101      |
|          2 | aniruddha  | keskar    |           102 | c102      |
|          2 | aniruddha  | keskar    |           103 | e101      |
+------------+------------+-----------+---------------+-----------+
4 rows in set (0.00 sec)

# AWS Assignment Steps

## 1. Java Project Setup
1. Created a new Java project named Student Management System.
2. Created `StudentManagement.java`.
3. Verified Java installation using `java -version` and `javac -version`.

## 2. MySQL Setup
1. Installed MySQL Server.
2. Started the MySQL80 Windows service.
3. Connected to MySQL using MySQL Workbench.
4. Created the database:

```sql
CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    course VARCHAR(50),
    age INT
);
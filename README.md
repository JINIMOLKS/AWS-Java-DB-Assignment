# Student Management System

A simple Java-based Student Management System connected to a MySQL database using JDBC.

## Technologies Used

- Java
- MySQL
- JDBC (MySQL Connector/J)
- VS Code

## Features

- Add student
- View students
- Update student details
- Delete student
- MySQL database connectivity

## Database

Database name:

student_db

Table name:

students

Table structure:

| Column | Type |
|---|---|
| id | INT |
| name | VARCHAR(100) |
| course | VARCHAR(50) |
| age | INT |

## How to Run

1. Install Java and MySQL.
2. Create the `student_db` database and `students` table.
3. Add MySQL Connector/J to the `lib` folder.
4. Compile the program:

```bash
javac -cp ".;lib\mysql-connector-j-26.7.0.jar" StudentManagement.java
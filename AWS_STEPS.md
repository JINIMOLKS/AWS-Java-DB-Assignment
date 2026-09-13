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
## 6. AWS Deployment

1. Created an Amazon EC2 instance using Amazon Linux 2023.
2. Configured the EC2 instance with a security group and SSH access.
3. Connected to the EC2 instance using EC2 Instance Connect.
4. Installed Java 17 on the EC2 instance.
5. Installed Java development tools including `javac`.
6. Installed MariaDB database server.
7. Started and enabled the MariaDB service.
8. Created the `student_db` database.
9. Created the `students` table.
10. Created a separate database user for the Java application.
11. Cloned the project from GitHub to the EC2 instance.
12. Compiled the Java application using MySQL Connector/J.
13. Connected the Java application to the MariaDB database.
14. Tested the Student Management System on AWS.
15. Tested Add, View, Update and Delete operations successfully.

## 7. GitHub

1. Created a public GitHub repository.
2. Uploaded the Java source code and project documentation.
3. Updated the AWS checklist and deployment steps.
4. Verified the project files in the GitHub repository.

## 8. Submission

The GitHub repository link will be submitted through Google Classroom.
# Student Management System (JDBC + MySQL)

This is a simple **Student Management System** developed in **Java** using **JDBC (Java Database Connectivity)**. The project allows basic CRUD operations (Create, Read, Update, Delete) on student records stored in a **MySQL database**.

---

## 🚀 Features

- Add a new student
- View all students
- View student by roll number
- Update student details
- Delete student record

---

## 🛠️ Tech Stack

- **Java** (Core Java)
- **JDBC API**
- **MySQL** (RDBMS)
- **Eclipse/IntelliJ IDEA** (IDE)

---

## 📂 Project Structure

StudentManagement/
│
├── com.studentmanagement.model
│ └── Student.java
│
├── com.studentmanagement.dao
│ ├── StudentDaoInterface.java
│ └── StudentDaoImpl.java
│
├── com.studentmanagement.main
│ └── Main.java
│
└── README.md

## 🧮 Database Configuration (MySQL)

### Step 1: Create Database

```sql
CREATE DATABASE DB_Name;
USE DB_Name;
```Create Table
create table Table_Name(attributes.....);

```insert the values into table
insert into Table_Name values (value1),(value2);


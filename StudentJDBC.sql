
-- Create the database
CREATE DATABASE Student;
USE Student;

-- Create the Students table
CREATE TABLE Students (
    rollNo VARCHAR(20),
    Name VARCHAR(30),
    Gender VARCHAR(30),
    email VARCHAR(30),
    DoB DATE,
    ClgName VARCHAR(30),
    city VARCHAR(30),
    percentage FLOAT,
    PRIMARY KEY (rollNo)
);

-- Describe the Students table
DESC Students;

-- Insert data into the Students table
INSERT INTO Students (rollNo, Name, Gender, email, Dob, ClgName, city, percentage) VALUES 
('221FA04076','Irfan','Male','221FA04076@gmail.com','2004-01-01','Vignan University','Kathiyar',65.5),
('221FA04078','Ajay','Male','221FA04078@gmail.com','2004-09-02','Vignan University','Dendulur',65.6),
('221FA04079','Bhavana','Female','221FA04079@gmail.com','2004-01-15','Vignan University','Mangalgiri',68.4),
('221FA4081','Seetha','Female','221FA04081@gmail.com','2005-10-04','Vignan University','Surepalli',73.8),
('221FA04084','Pranitha','Female','221FA04084@gmail.com','2004-02-29','Vignan University','Guntur',80.4),
('221FA04085','SomaSekhar','Male','221FA04085@gmail.com','2005-09-18','Vignan University','Guntur',73.49),
('221FA04091','Rohith','Male','221FA04091@gmail.com','2004-10-15','Vignan University','Edlapalli',65.5),
('221FA04127','Kumar','Male','221FA04127@gmail.com','2005-02-03','Vignan University','Upputur',65.5),
('221FA04141','RajaGopal','Male','221FA04141@gmail.com','2003-08-03','Vignan University','Perecherla',63.5),
('221FA04149','SindhusriSaiChandraLekha','Female','221FA04149@gmail.com','2005-04-05','Vignan University','Bapatla',82.5);

-- Display all records
SELECT * FROM Students;

-- Query a specific student by rollNo
SELECT * FROM Students WHERE rollNo = '221FA04085';

<h1> Student Result Management System </h1>
This is a CLI based software where the Software is capable of maintaining and generating Student's Result at the end of a semester after the teacher's have provided the respective marks. <br>
The following things are required in the system for the proper functioning of the software. <br>

```
JAVA
JDK 17
MySQL 8
```
<h1>Index</h1>
<ul>
<li>Driver File</li>
<li>Data Flow Diagram</li>
<li>Software Requirement Specifications</li>
<li> [MySQL JAVA Connector](https://github.com/abirbhattacharya82/Student_Result_Management_System/raw/main/assets/mysql_connector_driver/mysql-connector-java-8.0.26.jar) </li>
</ul>
<h1>User Manual</h1>
To properly run the software perform the following steps: <br>
<b>Step 1</b>: Create a New MySQL connection and name it <b>student_result_management_system</b>. If the server is <b>not in the local host</b> or your username is not <b>root</b> or password is not <b>admin</b>, change the following things on line numbers <b>11, 35, 66, 102, 128</b>:
<ul>
  <li>Change <b>127.0.0.1:3306</b> to <b>your server ip:your server port</b></li>
  <li>Replace <b>root</b> with <b>your username</b></li>
  <li>Replace <b>admin</b> with <b>your password</b></li>
</ul>
<b>Step 2</b>: Write the following three Querries and execute them one by one in your querry editor.

```
CREATE SCHEMA `student_result_management_system` ;

```
```
CREATE TABLE `student_result_management_system`.`student_db` (
  `student_name` VARCHAR(100) NULL,
  `student_roll` INT NOT NULL,
  `student_contact` VARCHAR(10) NULL,
  `student_subject1` INT NULL,
  `student_subject2` INT NULL,
  PRIMARY KEY (`student_roll`));
```
```
CREATE TABLE `student_result_management_system`.`user_db` (
  `user_role` VARCHAR(1),
  `user_name` VARCHAR(45),
  `user_password` VARCHAR(45)
);
```
<b>Step 3</b>: Download the [MySQL JAVA Connector](https://github.com/abirbhattacharya82/Student_Result_Management_System/raw/main/assets/mysql_connector_driver/mysql-connector-java-8.0.26.jar) if you don't have it and put it in <b>Java\jre1.8.0_201\lib\ext</b> folder in your system. <br>
<b>Step 4</b>: Clone this Repository using the following link
```
https://github.com/abirbhattacharya82/Student_Result_Management_System.git

```
<b>Step 5</b>: Open the <b>Command Prompt</b> for Windows Machines and <b>Terminal</b> for Linux Machines and use the following two commands and you are good to go
```
javac Main.java
java Main
```

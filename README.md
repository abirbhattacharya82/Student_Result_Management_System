# Student_Result_Management_System



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

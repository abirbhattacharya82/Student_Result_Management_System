# Software Requirements Specifications
## Overview:
This software is designed to generate the result of any particular student for a given course. The admin of this system updates the Student details such as name, roll number and contact number once the student has taken admission for the course. The next job is for the Teacher to upload the marks for the subjects individually. At the end the Student can view his marks and get a hard copy of the Result which will contain the details of student and the marks he got individually in each subject.
-----------------------------------------------
## User Characteristics:
The Users of the Software is capable of:
* Student: This user is capable of viewing his own marks as they are uploaded by Teacher.
* Teacher: This user uploads the marks of the subject for the student which he or she teaches.
* Admin: This user is responsible for updating the Student details of existing Students and also for new Students.
-----------------------------------------------
## Assumption Constraints:
* One teacher can teach only one subject
* Number of subject doesn't change
-----------------------------------------------
## User Interfaces:
* Login Screen: The Login Screen contains three input boxes. First one asking for role which can be either Student or Teacher or Admin. Second one is the user_id and third one is the password.
* Student Details Screen: This screen is available when the student logins and a button is available which can be clicked to Generate the Result. Apart from the Student, the Admin also has access to this page. Apart form the button other fields and features are:
  * Student Name
  * Student Roll Number
  * Student Contact Number
  * Subjects and their marks
-----------------------------------------------

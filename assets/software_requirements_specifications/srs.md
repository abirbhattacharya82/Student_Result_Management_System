# Software Requirements Specifications
<h2> Overview: </h2>
This software is designed to generate the result of any particular student for a given course. The admin of this system updates the Student details such as name, roll number and contact number once the student has taken admission for the course. The next job is for the Teacher to upload the marks for the subjects individually. At the end the Student can view his marks and get a hard copy of the Result which will contain the details of student and the marks he got individually in each subject.
<hr>
<h2> User Characteristics: </h2>
The Users of the Software is capable of: <br>
* Student: This user is capable of viewing his own marks as they are uploaded by Teacher. <br>
* Teacher: This user uploads the marks of the subject for the student which he or she teaches. <br>
* Admin: This user is responsible for updating the Student details of existing Students and also for new Students.
<hr>
<h2> Assumption Constraints: </h2>
* One teacher can teach only one subject <br>
* Number of subject doesn't change <br>
<hr>
<h2> User Interfaces: </h2>
* Login Screen: The Login Screen contains three input boxes. First one asking for role which can be either Student or Teacher or Admin. Second one is the user_id and third one is the password. <br>
* Student Details Screen: This screen is available when the student logins and a button is available which can be clicked to Generate the Result. Apart from the Student, the Admin also has access to this page. Apart form the button other fields and features are: <br>
  * Student Name <br>
  * Student Roll Number <br>
  * Student Contact Number <br>
  * Subjects and their marks <br>
<ul>
 <li>Student Name</li>
 <li>Student Roll Number</li>
 <li>Student Contact Number</li>
 <li>Subjects and their marks</li>
</ul>
* Marks Entry Screen: This screen contains 4 input boxes. This Screen will be visible to the Teacher who need to enter the Student’s roll number, Student’s name, Subject and Marks on that Subject. Apart from the Teacher the admin can access the screen as well. <br>
* Student Detail Entry Screen: This screen contains three input boxes and is accessible only by the admin. The Admin enters the Roll Number, Student’s Name and Student’s Contact. This is updated when a new Student takes admission or a present student updates his or her contact details. <br>
<hr>
<h2> Hardware Interfaces:- </h2>
* Appropriate drivers are needed. <br>
*  Screen Resolution of atleast 852 X 480 px for proper viewing. <br>
<h2> Software Interfaces:- </h2>
* Any Window based Operating System
<hr>
<h2>Functional Requirements:-</h2>
1) Student Information Maintenance: Information of the student like Student Name, Student Roll Number and Student Contact will be maintained by the system.
2) Marks Information Management: The Marks of the Student along with the Subjects will be maintained by the System.
3) Result Generation: The System will be able to generate the result containing Student Details, Marks of the Student in his respective subjects.
4) The system will be able to maintain the security and prevent unauthorized access by maintaining the user_id and passwords of every individual.

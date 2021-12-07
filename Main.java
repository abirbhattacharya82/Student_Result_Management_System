import java.sql.*;
import java.util.*;

class Generate_Result
{
    public void select_data(String roll)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_result_management_system","root","admin");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select * from student_db where student_roll="+roll);
            System.out.println("Name\t\t\tRoll Number\tContact\t\tSubject 1\tSubject 2");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t\t"+rs.getString(5));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Ehh Error :(");
        }
    }
}

class Login
{
    public boolean user_login(String role, String user_name, String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_result_management_system","root","admin");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select * from user_db");
            while(rs.next())
            {
                String s1=role+" "+user_name+" "+password;
                String s2=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3);
                if(s1.equalsIgnoreCase(s2))
                {
                    System.out.println("Login Successful");
                    return true;
                }
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Login Failed");
            return false;
        }
        return false;
    }
}

class Signup
{
    public void new_user(String role, String user_name, String password)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_result_management_system","root","admin");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("select * from user_db");
            boolean f=true;
            while(rs.next())
            {
                String s1=role+" "+user_name+" "+password;
                String s2=rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3);
                if(s1.equalsIgnoreCase(s2))
                {
                    System.out.println("Credentials are not Unique");
                    f=false;
                    break;
                }
            }
            if(f)
            {
                System.out.println("Sign_Up Successful");
                int z=smt.executeUpdate("insert into user_db (user_role, user_name,user_password) values ('"+role+"','"+user_name+"','"+password+"')");
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Upload_marks
{
    public void upload_marks_in_student_db(int roll, int marks, int subject)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_result_management_system","root","admin");
            Statement smt=con.createStatement();
            if(subject==1)
            {
                int z=smt.executeUpdate("update student_db set student_subject1 = "+marks+" where student_roll = "+roll);
            }
            else if(subject==2)
            {
                int z=smt.executeUpdate("update student_db set student_subject2 = "+marks+" where student_roll = "+roll);
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class Update_Student
{
    public void new_student(String name, int roll, String contact)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_result_management_system","root","admin");
            Statement smt=con.createStatement();
            String q="insert into student_db (student_name,student_roll,student_contact,student_subject1,student_subject2) values ('"+name+"',"+roll+",'"+contact+"',0,0)";
            // System.out.println(q);
            int z=smt.executeUpdate(q);
            System.out.println("New Student Added");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        String zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz;
        Scanner sc=new Scanner(System.in);
        int job_done=1;
        while(job_done==1)
        {
            System.out.println("Press (1) to Login, Press (2) to SignUp and Press (3) to exit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.print("Enter (1) if you are Admin, (2) for Teacher and (3) for Student: ");
                zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz=sc.nextLine();
                String role=sc.nextLine();
                System.out.print("Enter Your Username: ");
                String username=sc.nextLine();
                System.out.print("Enter Your Password: ");
                String password=sc.nextLine();
                Login obj=new Login();
                boolean f=obj.user_login(role,username,password);
                while(f)
                {
                    if(role.equalsIgnoreCase("1"))
                    {
                        System.out.println("Press (1) to add New Student, (2) to Generate Result and (3) to LogOut");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz=sc.nextLine();
                            System.out.print("Enter the Name: ");
                            String name=sc.nextLine();
                            System.out.print("Enter the Roll Number: ");
                            int rollno=sc.nextInt();
                            zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz=sc.nextLine();
                            System.out.print("Enter the Student's Contact Number: ");
                            String contact=sc.nextLine();
                            Update_Student obj2=new Update_Student();
                            obj2.new_student(name,rollno,contact);
                        }
                        else if(choice==2)
                        {
                            System.out.print("Enter the Roll Number: ");
                            int rollno=sc.nextInt();
                            Generate_Result obj3=new Generate_Result();
                            obj3.select_data(""+rollno);
                        }
                        else if(choice==3)
                        {
                            f=false;
                            break;
                        }
                    }
                    else if(role.equalsIgnoreCase("2"))
                    {
                        System.out.println("Enter (1) to enter marks and (2) to exit");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            System.out.print("Enter the Roll Number: ");
                            int roll=sc.nextInt();
                            System.out.print("Enter the Marks: ");
                            int marks=sc.nextInt();
                            System.out.print("Enter the Subject Number(1 or 2): ");
                            int subject=sc.nextInt();
                            // System.out.println(roll+" "+marks+" "+subject);
                            Upload_marks obj5=new Upload_marks();
                            obj5.upload_marks_in_student_db(roll,marks,subject);
                        }
                        else
                        {
                            f=false;
                            break;
                        }
                    }
                    else if(role.equalsIgnoreCase("3"))
                    {
                        System.out.println("Enter (1) to Generate Result and (2) to exit");
                        choice=sc.nextInt();
                        if(choice==1)
                        {
                            System.out.print("Enter the Roll Number: ");
                            int rollno=sc.nextInt();
                            Generate_Result obj4=new Generate_Result();
                            obj4.select_data(""+rollno);   
                        }
                        else
                        {
                            f=false;
                            break;
                        }
                    }
                }
            }
            else if(choice==2)
            {
                System.out.print("Enter (1) if you are Admin, (2) for Teacher and (3) for Student: ");
                zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz=sc.nextLine();
                String role=sc.nextLine();
                System.out.print("Enter Your Username: ");
                String username=sc.nextLine();
                System.out.print("Enter Your Password: ");
                String password=sc.nextLine();
                // System.out.println(role+" "+username+" "+password);
                Signup obj4=new Signup();
                obj4.new_user(role,username,password);
            }
            else if(choice==3)
            {
                break;
            }
        }
    }
}
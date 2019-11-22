/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 package lab;
 import java.sql.*;
/**
 *
 * @author USER
 */  
public class Course {
    String s1="SENG 11111- Object Oriented programming";
    String s2="SENG 11112-Introduction to databases";
    String s3="SENG 11123-Project Management";


    public void Courseno(int x){
 try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/details", "root", "@Sivanu1998"
 );
 Statement st = con.createStatement();
 PreparedStatement sts = con.prepareStatement("INSERT INTO emp(Name,Username, Age,
Password) VALUES (?, ?, ?,?)");
 sts.setString(1, fname);
 sts.setString(2, use);
 sts.setInt(3, age);
 sts.setString(4, pass);
 sts.executeUpdate();
 con.close();

 }catch (Exception e){System.out.println(e);}
 }
 public void Display() {
 System.out.println("You have successfully registered for the followuing course: ");
 try {
 Class.forName("com.mysql.jdbc.Driver");
 Connection con = DriverManager.getConnection(
 "jdbc:mysql://localhost:3306/details", "root", "@Sivanu1998"
 );
 Statement sta = con.createStatement();
 PreparedStatement sts = con.prepareStatement("INSERT INTO course (username,course) VALUES
(?,?)");
        switch(x){
            case 1:
                System.out.println("Subject:"+s1);
				sts.setString(1,uname);
				sts.setString(2,"Object Oriented programming");
				sts.executeUpdate();
                break;
                 case 2:
                System.out.println("Subject:"+s2);
				sts.setString(1,uname);
				sts.setString(2,"SENG 11112-Introduction to databases");
				sts.executeUpdate();
                break;
                 case 3:
                System.out.println("Subject:"+s3);
					sts.setString(1,uname);
				sts.setString(2,"SENG 11123-Project Management");
				sts.executeUpdate();
				
                break;
        }
		con.close();
		}catch(Exception e) {System.out.println(e);}
		


	}
}

 
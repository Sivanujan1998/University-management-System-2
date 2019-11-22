/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */

public class lecture {
   String name;
    int age;
    int course;
	int pass;
   String use;
      
    public lecture(String fname,String USE,int PASS,int AGE,int Course)
	{
        this.name=fname;
        this.age=AGE;
        this.course=Course;
		this.pass=PASS;		
		this.use=USE;
        
    }
    public void printdata(){
        System.out.println("Welcome to university registration System");
        System.out.printf("\n\n....");
        System.out.println("lecture Registration completed");
        System.out.printf("Name   :%s\n",name);
        System.out.printf("UserName   :%s\n",use);
		 System.out.printf("Password   :%d\n",pass);
        System.out.printf("Age    :%d\n",age  );
		System.out.println("you have successfully registered for th course");
        Course my=new Course();
        my.Courseno(course);
		
			
        
    }
}    
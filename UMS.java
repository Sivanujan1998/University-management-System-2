/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class UMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
		
		   Scanner input=new Scanner(System.in);
		   for(int j=0;;j++){{
        System.out.println("***Select, [1] sign up, [2] sign in***");
		int x=input.nextInt();
		System.out.println("Please Select Your Registration role [1] Lecturer, [2] Student");
		int option=input.nextInt();
		switch(x)
		{
			
			case 1:
			if(option==2){
				System.out.println("****Student Registration form****\n\n");
				
             System.out.println("Name:-");
             Scanner in=new Scanner(System.in);
             String fname=in.nextLine();
			 
			 System.out.println("Username:-");
             String use=input.next();
			 System.out.println("Password:-");
			 int pass=input.nextInt();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11111- Object Oriented programming");
             System.out.println("[2]-SENG 11112-Introduction to databases");
             System.out.println("[3]-SENG 11123-Project Management");
             int c=input.nextInt();
             Student std = new Student(fname,use,pass,age,c);
             std.printdata();
			 
    
	
        }
        else if (option==1){
			System.out.println("****Lecturer Registration form****\n\n");
            System.out.println("Name:-");
			Scanner in=new Scanner(System.in);
             String fname=in.nextLine();
			  System.out.println("Username:-");
             String use=input.next();
			 System.out.println("Password:-");
			 int pass=input.nextInt();
             System.out.println("AGE:-");
             int age=input.nextInt();
             System.out.println("please select course");
             System.out.println("[1]-SENG 11111- Object Oriented programming");
             System.out.println("[2]-SENG 11112-Introduction to databases");
             System.out.println("[3]-SENG 11123-Project Management");
             int c=input.nextInt();
             lecture lec=new lecture(fname,use,pass,age,c);
             lec.printdata();
			 break;
			 
    

        }
		
			case 2:
			
			if(option==2){
				System.out.println("****Student login form****\n\n");
				
            
			 System.out.println("Username:-");
             String use=input.next();
			 System.out.println("Password:-");
			 int pass=input.nextInt();

	
          

        }
        else if (option==1){
			System.out.println("****Lecturer login form****\n\n");
       
			  System.out.println("Username:-");
             String use=input.next();
			 System.out.println("Password:-");
			 int pass=input.nextInt();
			 break;
    
         

        }
			 	
		}
		
         
	System.out.println("thank you !!!");
 System.out.println("please select a option  \n[1]  exit\n [2] register new course");
 
			int y=input.nextInt();
			if(y==1)
			{
				System.out.println("BYE!!\n\n");
			break;
			}
			else
			{continue;}
             
        
        
           

		   }}
  

    }

}




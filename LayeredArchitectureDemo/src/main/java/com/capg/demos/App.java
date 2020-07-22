package com.capg.demos;

import java.sql.SQLException;
import java.util.Scanner;

import com.capg.demos.controller.TraineeController;
import com.capg.demos.model.Trainee;

/**
 * Hello world!
 *
 */




public class App 
{
	
    public static void main( String[] args ) throws SQLException
    {
    	TraineeController controller=new TraineeController();
    	Trainee t1;
    	int id;
    	String name;
    	String email;
    	Scanner in=new Scanner(System.in);
    	 System.out.println( "Enter Trainee Details - (Id,Name,email)" );
    	System.out.println("Enter ID:");
    	id=in.nextInt();
    	System.out.println("Enter Name:");
    	name=in.next()+in.nextLine();
    	System.out.println("Enter Email:");
    	email=in.next()+in.nextLine();
    	
    	Trainee trainee=new Trainee(id,name,email);
    	try {
    	Trainee addedTrainee=controller.addTrainee(trainee);
    	System.out.println("Trainee Added "+addedTrainee);
    	
    	}
    	catch (Exception e) {
    		
			System.out.println("Error...");
			e.printStackTrace();
		}
   
    	
       
    }
}

package com.model.operations;

import java.io.*;
import java.util.*;
import com.model.operations.BusinessLevelOperations;

public class Appmain {

	public static void main(String[] args) {
	
		welcomeScreen();
		try {
			menuDriven();
		} catch (Exception e) {
		}	
	}

	public static void welcomeScreen() {
		System.out.println("Application Name : LOCKED ME \n");
		System.out.println("Developer Details: Developed by Project Owner \n");
	}

	public static void menuDriven() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Projectphase1 obj = new Projectphase1();
		int option;
		do {
		System.out.println("Enter your choice which you want to select: \n");
		System.out.println("\t1. Retrieve current filenames in ascending order \n");
		System.out.println("\t2. Business-level operation menu \n");
		System.out.println("\t3. Exit from the application \n");
		
		option=sc.nextInt();
		
		switch(option) {
		case 1:
			obj.showAllFiles();
			break;
		case 2:
			businesslogic();
			break;
		case 3:
			System.out.println("Exiting from the application...");
			break;
		default:
			System.out.println("Invalid choice");sc.close();
		}
		
		//System.out.println("Press 0 to continue");
		}while(option!=3);
		
	}

	private static void businesslogic() {
		Projectphase1 obj = new Projectphase1();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter your choice for Business level operation");
			System.out.println("\t4. Add a file and its content to a directory");
			System.out.println("\t5. Delete a file from a directory");
			System.out.println("\t6. Searching a file and showing its content");
			System.out.println("\t7. Exit from BOL menu");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 4:
				obj.addFile();
				break;
			case 5:
				obj.deleteFile();
				break;
			case 6:
				obj.searchFile();
				break;
			case 7:
				System.out.println("Exited from the Business Level operation...");
				System.out.println("---------------------------------\n");
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}while(ch!=4);
		// TODO Auto-generated method stub
		
	}
}

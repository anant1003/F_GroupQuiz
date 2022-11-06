package com.quiz.main;

import java.util.Scanner;

import com.quiz.database.McqDB;
import com.quiz.database.StudentDB;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Student Login\n2.Admin Login");
		System.out.println("Enter option: ");
		int input =scan.nextInt();
		switch(input) {
		case 1:
			StudentDB.studentLogin();
			break;
		case 2:
			System.out.print("\nEnter UserName:");
			String userName =scan.next();
			System.out.print("\nEnter Password:");
			String password =scan.next();
			if(userName.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
				System.out.println("1.Single Student Detail.\n2.All Student Details");
				int option = scan.nextInt();
				if(option==1) {
					System.out.print("\nEnter RollNo:");
					int rollNo = scan.nextInt();
					StudentDB.displayMarksById(rollNo);
				}else if(option==2) {
					StudentDB.displayStudentList();
				}
			}
		}
	}
}

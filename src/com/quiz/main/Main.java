package com.quiz.main;

import java.util.Scanner;

import com.quiz.database.McqDB;
import com.quiz.database.StudentDB;


public class Main {
	public static void main(String[] args) {
		System.out.println("\t\t\t\t\t\t WELCOME TO GROUP F QUIZ ");
		Scanner scan = new Scanner(System.in);
		boolean flag1 = true;
		do {
			System.out.println("\n************************* LOGIN DETAILS *************************\n");
			System.out.println("1. Student Login\n2. Admin Login");
			System.out.print("Select option: ");
			int input =scan.nextInt();
			switch(input) {
			case 1:
				flag1 = false;
				StudentDB.studentLogin();
				break;
			case 2:
				flag1 = false;
				System.out.println("\n************************* ADMIN DETAILS *************************\n");
				System.out.print("Enter UserName:");
				String userName =scan.next();
				System.out.print("Enter Password:");
				String password =scan.next();
				boolean flag2=true;
				do {
				if(userName.equalsIgnoreCase("Admin") && password.equalsIgnoreCase("Admin")) {
					System.out.println("\n*********************** STUDENT INFORMATION *********************");
					System.out.println("\n1. Single Student Detail\n2. All Student Details\n3. Exit");
					System.out.print("Select option: ");
					int option = scan.nextInt();
					if(option==1) {
						System.out.print("\nEnter RollNo:");
						int rollNo = scan.nextInt();
						StudentDB.displayMarksById(rollNo);
						System.out.print("\nEnter yes to return to Student Information section: ");
						String info = scan.next();
						if(info.equals("yes")) {
						flag2=true;
						}else if(info.equals("no")){
							flag1=true;
							break;
						}
					}else if(option==2) {
						StudentDB.displayStudentList();
						System.out.print("\nEnter yes to return to Student Information section: ");
						String info = scan.next();
						if(info.equals("yes")) {
						flag2=true;
						}else if(info.equals("no")){
							flag1=true;
							break;
						}
					}else if(option == 3) {
						flag1=true;
						break;
					}
				}
			}while(flag2);
				break;
			default:
				System.out.println("\nWrong Input!!!\nPlease select from the given options.\n");
			}
			
		}while(flag1);
	}
}

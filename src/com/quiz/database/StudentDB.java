package com.quiz.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.quiz.model.StudentModel;
import com.quiz.student.MarksComparator;
import com.quiz.validation.Validation;

public class StudentDB {
	static Scanner scan = new Scanner(System.in);

	public static List<StudentModel> loadStudentintoList() {
		Connection con = JDBCConnection.getConnection();
		String query = "select * from student";
		List<StudentModel> slist = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				slist.add(new StudentModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getBoolean(6)));
			}
		} catch (SQLException e) {
			System.out.println(
					"Exception occured while Connecting to Database in StudentDB class & loadStudentintoList()");
		}
		return slist;
	}

	public static void studentLogin() {
		System.out.print("\nEnter your Rollno:");
		int rollNo = scan.nextInt();
		System.out.print("Enter your Password:");
		String password = scan.next();
		List<StudentModel> slist = loadStudentintoList();
		Iterator<StudentModel> itr = slist.iterator();
		while (itr.hasNext()) {
			StudentModel s = (StudentModel) itr.next();
			if (s.getRollno() == rollNo && s.getPassword().equals(password)) {
				if (s.isExamstatus() == true) {
					displayMarksById(rollNo);
				} else {
					System.out.println("\nHi " + s.getFirstName() + " " + s.getLastName());
					int score = McqDB.startQuiz();
					updateScoreInDB(rollNo, score);
					System.out.println("\nYour test is submitted successfully\n");
					displayMarksById(rollNo);
				}
			}
		}
	}

	public static void updateScoreInDB(int rollNo, int score) {
		Connection con = JDBCConnection.getConnection();
		String query = "update student set marks =?,examstatus =? where rollno=?";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, score);
			pst.setBoolean(2, true);
			pst.setInt(3, rollNo);
			pst.execute();
		} catch (SQLException e) {
			System.out.println("Exception occured while Connecting to Database in StudentDB class & updateScoreInDB()");
		}
	}

	public static void displayMarksById(int rollNo) {
		Connection con = JDBCConnection.getConnection();
		String query = "select fname,lname,marks,examstatus from student where rollno=?";

		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, rollNo);
			ResultSet rs = pst.executeQuery();
			String fName = "";
			String lName = "";
			int marks = 0;
			boolean examstatus = false;
			while (rs.next()) {
				fName = rs.getString(1);
				lName = rs.getString(2);
				marks = rs.getInt(3);
				examstatus = rs.getBoolean(4);
			}
			if (!examstatus)
				System.out.println(fName+" "+lName+" has not appeared for the test...");
			else {
				System.out.println("\n***************Your Result******************");
				System.out.println("--------------------------------------------");
				System.out.println("Roll No : " + rollNo);
				System.out.println("Name 	: " + fName + " " + lName);
				System.out.println("Marks 	: " + marks);
				System.out.println("Grade 	: " + Validation.gradeValidation(marks));
				System.out.println("--------------------------------------------");
			}
		} catch (SQLException e) {
			System.out.println(
					"Exception occured while Connecting to Database in StudentDB class & loadStudentintoList()");
		}
	}

	public static void displayStudentList() {
		List<StudentModel> slist = loadStudentintoList();
		Collections.sort(slist, new MarksComparator());
		Iterator<StudentModel> itr = slist.iterator();
		System.out.println("***************Student Records***************");
		System.out.println("--------------------------------------------");
		System.out.println("RollNo\tStudent Name\tMarks\tGrade");
		System.out.println("--------------------------------------------");
		while (itr.hasNext()) {
			StudentModel sm = itr.next();
			System.out.println(" " + sm.getRollno() + "\t" + sm.getFirstName() + " " + sm.getLastName() + "\t  "
					+ (sm.isExamstatus()?sm.getScore():"NA") + "\t  " + (sm.isExamstatus()?Validation.gradeValidation(sm.getScore()):"NA"));
		}
		System.out.println("--------------------------------------------");
	}

}

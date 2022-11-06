package com.quiz.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.quiz.model.McqModel;

public class McqDB {
	 
	static Scanner scan = new Scanner(System.in);

	public static List<McqModel> loadMcqIntoList() {
		Connection con = JDBCConnection.getConnection();
		List<McqModel> mcqList = new ArrayList<>();
		String query = "select * from mcq";
		try {
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				mcqList.add(new McqModel(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			System.out.println("Exception occured while Connecting to Database in McqDB class");
		}
		return mcqList;
	}

	public static int startQuiz() {
		List<McqModel> mcqList = loadMcqIntoList();
		int min = 1;
		int score =0;
		int range = 20;
		int count = 0;
		ArrayList<Integer> al = new ArrayList<>();
		while (count != 10) {
			int random = (int) (Math.random() * range) + min;
			if (!al.contains(random)) {
				count++;
				al.add(random);
				McqModel Q = mcqList.get(random);
				System.out.println("\n"+count+") "+Q.getQuestions());
				System.out.println(Q.getOption_a());
				System.out.println(Q.getOption_b());
				System.out.println(Q.getOption_c());
				System.out.println(Q.getOption_d());
				System.out.print("Select option:");
				int ans = scan.nextInt();
				if (ans == Q.getcAns()) {
					score++;
				}
			}

		}
		return score;
	}

}

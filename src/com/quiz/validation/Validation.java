package com.quiz.validation;

public class Validation {

	public static String gradeValidation(int marks) {
		if (marks >= 8 && marks <= 10)
			return "A";
		else if (marks >= 6 && marks < 8)
			return "B";
		else if (marks == 5)
			return "C";
		else
			return "D";
	}
}

package com.quiz.student;

import java.util.Comparator;

import com.quiz.model.StudentModel;

public class MarksComparator implements Comparator<StudentModel>{

	@Override
	public int compare(StudentModel s1, StudentModel s2) {
		if(s1.getScore() < s2.getScore())
			return 1;
		else if(s1.getScore()==s2.getScore()) {
			return s1.getFirstName().compareTo(s2.getFirstName());
			
		}
		return -1;
	}
	

}

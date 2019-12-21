package com.student.impl;

import com.student.studentData.Database;

public class StudentScoreUpdate {

	private Database database;
	
	public StudentScoreUpdate(Database database) {
		this.database=database;
	}
	
	public void calculateSumAndScore(String studentId, int score[]) {
		int  total=0;
		for(int marks:score) {
			total+=marks;
		}
		database.updateScores(studentId, total);
	}

}

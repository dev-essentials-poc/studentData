package com.student.studentData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.impl.StudentScoreUpdate;

@SpringBootApplication
public class StudentDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDataApplication.class, args);
		Database database=new Database() {
			
			@Override
			public void updateScores(String studentId, int total) {
				System.out.println(studentId+"  "+total);
				
			}
		};
		StudentScoreUpdate update= new  StudentScoreUpdate(database);
		update.calculateSumAndScore("RamYewale", new int[] {10,52,45,62});
	}
}

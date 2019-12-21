package com.student.studentData;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.student.impl.StudentScoreUpdate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDataApplicationTests {

	@InjectMocks
	private StudentScoreUpdate studScoreUpdate;

	@Mock
	private Database database;

	@Test
	public void contextLoads() {
		StudentScoreUpdate student = new StudentScoreUpdate(database);
		int score[] = { 60, 100, 90 };

		Mockito.doNothing().when(database).updateScores("studentId", 250);
		studScoreUpdate.calculateSumAndScore("studentId", score);
		verify(database, times(1)).updateScores("studentId", 250);

	}

}

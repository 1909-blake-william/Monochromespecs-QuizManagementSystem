package com.revature.daos;

import com.revature.models.Quiz;

public interface QuizDao {
	
	int save (Quiz qz);
	
	//Better to return a question id?
	int findByQuizId(int quizId);
	
	int findByQuizTitle(String quizTitle);
	
	int findByAssignedTo(String assignedTo);
	
	int findByCreatedBy(String createdBy);
	
}

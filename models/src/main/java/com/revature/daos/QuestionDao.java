package com.revature.daos;

import com.revature.models.*;

public interface QuestionDao {
	
	int findByQuestionTopic(String topic);
	
	int findByQuestionTopicAndSubtopic(String topic, String subTopic);
	
	String findByQuestionId(int questionId);
	
	Question findAllQuestions()
	
	

}

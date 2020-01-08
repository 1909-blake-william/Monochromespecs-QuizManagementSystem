package com.revature.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Question;
import com.revature.util.ConnectionFactory;

public class QuestionDaoImpl implements QuestionDao {
	
	private static final QuestionDao instance = new QuestionDaoImpl();
	
	//Restricts instantiation
	private QuestionDaoImpl() {};
	
	//Magic strings for security
	private static final String FIND_ALL = "SELECT * from Quiz ";
	private static final String FIND_ALL_BY_USERNAME = FIND_ALL + " Where username = ?";
	private static final String FIND_ALL_BY_STATUS = FIND_ALL + " Where active = ?";
	private static final String FIND_BY_ID = FIND_ALL + " Where id = ?";
	private static final String INSERT_QUIZ = "INSERT INTO quiz "
			+ "(quizId, quizTitle, assignedTo, createdByWhom, createdByWhen) "
			+ "VALUES (QUIZ_SEQ.nextval, ?, ?, ?, CURRENT_TIMESTAMP)";
	private static final String RESOLVE = "UPDATE quiz "
			+ "SET active = ?, createdByWhom = ?, createdByWhen = ?"
			+ " Where quiz_id = ?";
	private static final String FIND_BY_QUESTION_TOPIC = "SELECT * from Question " + 
			"Where category = ?";
	
	private static Question extract(ResultSet rs) throws SQLException {
		return Question();
	} 
	
	@Override
	public int findByQuestionTopic(String topic) {
		List<Question> questions = new ArrayList<>(); 
		//Uses a connection from a connection pool
		try (Connection con = new ConnectionFactory.getConnection()) {
			PreparedStatement ps = con.createStatement();
			ResultSet rs = ps.executeQuery(FIND_BY_QUESTION_TOPIC);
			while (rs.next()) {
				questions.add(rs);
			}
		} catch (SQLException e) {
			
		}

		return 0;
	}

	@Override
	public int findByQuestionTopicAndSubtopic(String topic, String subTopic) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String findByQuestionId(int questionId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static QuestionDao getInstance() {
		return instance;
	}

}

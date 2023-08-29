package com.sherlin.QuizApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="question")
public class QuestionClass {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String Category;
	
	
	@Column(name="difficultyLevel")
	private String difficultyLevel; 
	
	private String option1;
	
	private String option2;
	
	private String option3;
	
	private String option4;
	
	private String question_title;
	
	private String right_answer;
	
	

}

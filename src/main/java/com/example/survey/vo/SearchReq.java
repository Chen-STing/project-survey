package com.example.survey.vo;

import java.time.LocalDate;

public class SearchReq {
	
	private String quizTitle; 
	
	private LocalDate startDate; 
	
	private LocalDate endDate;
	
	public SearchReq(String quizTitle, LocalDate startDate, LocalDate endDate) {
		super();
		this.quizTitle = quizTitle;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public SearchReq() {
		super();
	}

	public String getQuizTitle() {
		return quizTitle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	

}

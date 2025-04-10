package com.gvg.questions;

import java.util.Arrays;

public class questions {
	private String question;
	private String[] options;
	private String answer;
	
	public questions(String question,String[] options,String answer){
		this.question=question;
		this.options=options;
		this.answer=answer;
	}

	public String getQuestion() {
		return question;
	}

	public String[] getOptions() {
		return options;
	}

	public String getAnswer() {
		return answer;
	}

	
	
}

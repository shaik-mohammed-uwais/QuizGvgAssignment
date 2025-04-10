package com.gvg.questionsdata;

import java.util.ArrayList;
import com.gvg.questions.questions;

public class qnsdata {
	
	public static ArrayList<questions> getQuestions() {
		ArrayList<questions> qdata=new ArrayList<>();
		
		qdata.add(new questions(
	            "What is the capital of France?",
	            new String[] {"A. Paris", "B. Rome", "C. Berlin", "D. Madrid"},
	            "a"));
		qdata.add(new questions(
	            "Which language runs on web browser",
	            new String[] {"A. Java", "B. C", "C. Python", "D. JavaScript"},
	            "d"));
		qdata.add(new questions(
	            "Which planet is known as the Red Planet?",
	            new String[] {"A. Earth", "B. Mars", "C. Jupiter", "D. Venus"},
	            "b"));
		qdata.add(new questions(
	            "Who wrote the play 'Romeo and Juliet'?",
	            new String[] {"A. Charles Dickens", "B. William Shakespeare", "C. Mark Twain", "D. Jane Austen"},
	            "b"));
		qdata.add(new questions(
	            "What is the largest ocean on Earth?",
	            new String[] {"A. Atlantic Ocean", "B. Indian Ocean", "C. Arctic Ocean", "D. Pacific Ocean"},
	            "d"));
		
		return qdata;
	}

}

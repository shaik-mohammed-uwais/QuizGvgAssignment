package com.gvg.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.gvg.questions.questions;
import com.gvg.questionsdata.qnsdata;

public class mainclass {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String userName;
		
		System.out.println("enter your name : ");
		userName=sc.nextLine();
		
		boolean f=true;
		int score=0;
		while(f) {
			System.out.println();
			System.out.println("** start quiz **");
			System.out.println();
			
			for(questions val: qnsdata.getQuestions()) {
				
				System.out.println(val.getQuestion());
				System.out.println(Arrays.toString(val.getOptions()));
				String ans=sc.nextLine();
				
				if(ans.equalsIgnoreCase(val.getAnswer())) {
					System.out.println("correct answer :) ");
					System.out.println();
					score+=10;
				}else {
					System.out.println("wrong answer : ( ");
					System.out.println("correct answer was : "+ val.getAnswer());
					System.out.println();
				}
				
			}
			System.out.println();
			System.out.printf(" %s final score is : %d", userName, score);
			System.out.println();
			System.out.println("want to start again ? yes= 1 or exit= 0");
			
			int opt;
			try {
				opt=sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("enter valid option ");
				sc.nextLine();
				continue;
			}
			
			if(opt==0) {
				f=false;
			}
			
		}
	}

}

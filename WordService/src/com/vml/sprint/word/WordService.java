package com.vml.sprint.word;

public class WordService {

	public String sayHello(String s) {
		return "Hello "+s;
	}
	
	public String concatenate(String s1, String s2, String s3) {
		return s1 + " " + s2 + " " + s3;
	}
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}

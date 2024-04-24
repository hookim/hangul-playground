package com.example.util;

import java.util.Random;

public class RandomString {
	
	static private Random rand = new Random(); 
	
	static public StringBuilder randomWord(String randSeedString) {
		StringBuilder str = new StringBuilder("");
		
		for(int i = 0; i < randSeedString.length(); i++) {
			if(i % 5 == 0) {
				str.append((char)(44032 + rand.nextInt(55215-44032)));
			}
			
			str.append(randSeedString.charAt(i % randSeedString.length()));
		}
		
		
		return str;
	}
}

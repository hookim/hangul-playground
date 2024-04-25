package com.example.util;

/*
 * 참조 문서 
 * https://d2.naver.com/helloworld/76650
 * 
 */

public class FlipString {
	
	static final int[] bToE = {1, 2, 4, 7, -1, 8, 16, 17, -1, 19, 20, 21, 22, -1, 23, 24, 25, 26, 27};
	static final int[] eToB = {-1, 0, 1, -1, 2, -1, -1, 3, 5, -1, -1, -1, -1, -1, -1, -1, 6, 7, -1, 9, 10, 11, 12, 14, 15, 16, 17, 18};
	
	public static StringBuilder flipHangul(String og) {
		StringBuilder flipped = new StringBuilder("");
		for(int i = 0 ; i < og.length(); i++) {
			flipped.append(flipLetter(og.charAt(i)));
		}
		
		return flipped;
	}
	
	public static char flipLetter(char c) {
		int code = (int) c;
		
		if(code < '\uAC00' || code > '\uD7A3') {
			return c;
		}
		
		code -= '\uAC00';
		
		int beg, middle, end;
		
		end = code % 28;
		middle = (int)(code % (21 * 28)) / 28;
		beg  = (int)(code / (28 * 21));
		
		int newEnd = bToE[beg];
		int newBeg = eToB[end];
		
		
		if(newEnd < 0 || newBeg < 0) {
			return c;
		}
		
		char newChar = (char)((newBeg * 21 + middle) * 28 + newEnd);
		
		return (char)('\uAC00' + (int) newChar);
		
	}

}

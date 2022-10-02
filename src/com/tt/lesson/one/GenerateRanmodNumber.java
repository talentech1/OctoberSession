package com.tt.lesson.one;

public class GenerateRanmodNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max =20;
		int min = -100;
		int randomNumber = (int) (Math.random() * (max - min + 1) + min); 
		
		System.out.println(randomNumber);
	}

}

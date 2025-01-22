package com.design_shinbi.exercise;

import java.util.Scanner;

public class Kazuate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double random = Math.random();
		int answer = (int)Math.floor(random * 10.0) + 1;
		int inputNumber = 0;
		
		while(inputNumber != answer) {
			System.out.println("数字を入れてください。 [1 ～ 10]");
			
			inputNumber = scanner.nextInt();
			
			if(inputNumber < answer) {
				System.out.println("数字が小さいです。");				
			}
			else if(inputNumber > answer) {
				System.out.println("数字が大きいです。");
			}
			else {
				System.out.println("正解です。");
			}
		}
				
		scanner.close();
	}
}

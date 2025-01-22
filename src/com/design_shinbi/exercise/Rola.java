package com.design_shinbi.exercise;

import java.util.Scanner;

public class Rola {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ローラもおともしとうございます。");
		
		boolean agreed = false;
		while(!agreed) {
			System.out.println("このローラもつれてってくださいますわね。");
			System.out.println("[Y] はい [N] いいえ");
			String input = scanner.nextLine();
			if(input.equalsIgnoreCase("Y")) {
				agreed = true;
			}
			else {
				System.out.println("そんな ひどい・・・");
			}
		}
		
		System.out.println("うれしゅうございます。");
		
		scanner.close();
	}
}

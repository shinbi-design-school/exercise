package com.design_shinbi.exercise;

public class Kuku {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int answer = i * j;
				System.out.print(j + " x " + i + " = " + answer);
				System.out.print("    ");
			}
			System.out.println();
		}
	}
}

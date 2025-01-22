package com.design_shinbi.exercise;

import java.util.Scanner;

public class TenSeconds {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter を押したらスタートします。");
		scanner.nextLine();
		
		long start = System.currentTimeMillis();
		
		System.out.println("10秒たったとかんじたら Enter を押してください。");
		
		scanner.nextLine();
		
		long end = System.currentTimeMillis();
		double time = (double)(end - start) / 1000.0;
		
		System.out.println(time + "秒でした。");
		
		scanner.close();
	}
}

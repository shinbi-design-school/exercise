package com.design_shinbi.exercise;

public class Pi {
	public static void main(String[] args) {
		step9();
	}
	
	public static void step1() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello.");
		}
	}
	
	public static void step2() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
	}
	
	public static void step3() {
		for(int i = 0; i < 10; i++) {
			double x = Math.random();
			double y = Math.random();
			System.out.println("x=" + x + ", y=" + y);
		}
	}
	
	public static void step4() {
		for(int i = 0; i < 10; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			System.out.println(r2 + " (x=" + x + ", y=" + y + ")");
		}
	}
	
	public static void step5() {
		int count = 0;
		for(int i = 0; i < 10; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			if (r2 <= 1.0) {
				count++;
			}
			System.out.println(r2 + " (x=" + x + ", y=" + y + ")");
		}
		System.out.println(count + "回");
	}
	
	public static void step6() {
		int count = 0;
		for(int i = 0; i < 10; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			if (r2 <= 1.0) {
				count++;
			}
		}
		System.out.println(count + "回");
	}	
	
	public static void step7() {
		int count = 0;
		for(int i = 0; i < 1000000; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			if (r2 <= 1.0) {
				count++;
			}
		}
		System.out.println(count + "回");
	}
	
	public static void step8() {
		int count = 0;
		for(int i = 0; i < 1000000; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			if (r2 <= 1.0) {
				count++;
			}
		}
		
		double p = (double)count / 1000000.0;
		System.out.println(p);
	}
	
	public static void step9() {
		int count = 0;
		for(int i = 0; i < 1000000; i++) {
			double x = Math.random();
			double y = Math.random();
			double r2 = x * x + y * y;
			if (r2 <= 1.0) {
				count++;
			}
		}
		
		double p = (double)count / 1000000.0;
		double pi = p * 4.0;
		System.out.println(pi);
	}	
}

package javachallengequestions;

import java.util.Scanner;

public class Q1Refactored {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		System.out.println("Enter two numbers");
        int addition = addition (a, b);
        System.out.println(addition);
		reader.close();
	}

	static int addition(int a, int b) {
		return a + b;
	}

	static int subtraction(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	static int avg(int a, int b) {
		return (a + b) / 2;
	}
	
}

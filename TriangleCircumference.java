package com.test;

import java.util.Scanner;

// 9
public class TriangleCircumference {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = scanner.nextInt();

		System.out.print("Enter b: ");
		int b = scanner.nextInt();

		System.out.print("Enter c: ");
		int c = scanner.nextInt();

		int circumference = a + b + c;

		System.out.println("Circumference: " + circumference);
		
		scanner.close();
	}

}

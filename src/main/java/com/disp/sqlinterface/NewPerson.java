package com.disp.sqlinterface;

import java.util.Scanner;

public class NewPerson {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a userID: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println(n);

	}

}

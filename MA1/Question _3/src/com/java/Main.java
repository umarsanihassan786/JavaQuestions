package com.java;

import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the numbers (enter -1 to finish): ");

	        int sum = 0;
	        int count = 0;
	        int number;

	        do {
	            number = scanner.nextInt();

	            if (number != -1) {
	                sum += number;
	                count++;
	            }
	        } while (number != -1);

	        if (count == 0) {
	            System.out.println("No numbers entered.");
	        } else {
	            double average = (double) sum / count;
	            System.out.println("Average: " + average);
	        }
	    }

}

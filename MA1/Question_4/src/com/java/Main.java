package com.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        int largest;

	        if (num1 >= num2) {
	            if (num1 >= num3) {
	                largest = num1;
	            } else {
	                largest = num3;
	            }
	        } else {
	            if (num2 >= num3) {
	                largest = num2;
	            } else {
	                largest = num3;
	            }
	        }

	        System.out.println("The largest number is: " + largest);
	    }

}

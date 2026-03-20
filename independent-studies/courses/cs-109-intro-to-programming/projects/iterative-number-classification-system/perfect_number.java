package com.mycompany.perfectnumberassignment;

import java.util.Scanner;

/*
 * @author mishannonabazid
 * Program Name: Perfect Number
 *
 * Program Purpose: The purpose of this program is to identify perfect numbers
 * between the range of 1-200.
 *
 * Part 1: Determining Perfect Numbers
 *  - Determines perfect numbers between 1 and 200
 *
 * Part 2: Allow User to Choose
 *  - Allows user to choose upper limit
 *  - Demonstrates usage of a method
 *  - Uses a larger data type to handle values above integer limits
 */

public class PerfectNumberAssignment {

    public static void main(String[] args) {

        // Part 1: Determining Perfect Numbers
        for (int number = 1; number <= 200; number++) {
            int sumOfDivisors = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                if (number % divisor == 0) {
                    sumOfDivisors = sumOfDivisors + divisor;
                }
            }
            if (sumOfDivisors == number) {
                System.out.println(number + " is a perfect number.");
            }
        }
        // Part 2: Allow User to Choose (larger numbers) 
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter upper limit to search for perfect numbers: "); 
        long upperLimit = input.nextLong();   
        
        // Call method for Part 2 
        
        findPerfectNumbers(upperLimit); 
        input.close(); 
    }   
    public static void findPerfectNumbers(long limit) { 
        
 	// Expanded data type to allow larger numbers 
        for (long number = 1; number <= limit; number++) { 
            long sumOfDivisors = 0; 
            for (long divisor = 1; divisor < number; divisor++) { 
                if (number % divisor == 0) { 
                    sumOfDivisors = sumOfDivisors + divisor; 
                } 
            } 
            if (sumOfDivisors == number) { 
                System.out.println(number + " is a perfect number."); 
            } 
         } 
    } 
} 

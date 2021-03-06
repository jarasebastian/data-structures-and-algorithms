package algorithms.recursion;

import java.util.Scanner;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Class which implements the fibonacci series from quantity of numbers to be generated
 */
public class Fibonacci {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.println("Insert the quantity of numbers to be calculated: ");
		int numbers = reader.nextInt();

		//this section iterates from 0 until a n gave
		for(int n = 0; n < numbers; n++){
			System.out.print(calculateFibonacci(n) + ", ");
		}
		
	}

	/**
	 * Recursive method responsible of calculate the fibonacci of a specific number
	 * @param n is the number for calculating its fibonacci
	 * @return a int with the value for a specific n calculated
	 */
	public static int calculateFibonacci(int n) {
		if (n==0) return 0;
		if (n==1) return 1;
		if (n>1) return calculateFibonacci(n-1) + calculateFibonacci(n-2);
		return -1;
	}
}

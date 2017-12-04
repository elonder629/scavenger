package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class ScavengerOne {

	private static int[] bestItems(int capacity, int[] available) {
		// YOUR CODE IN HERE
        // 
        // Your code should return the weights of the items that Rey should load in the speeder
        // If there is no subset of the items that adds up to the "capacity", it should return an empty array

		return new int[0];
		// YOUR CODE IN HERE
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numOfTestCases = sc.nextInt();

		for (int testCase=0; testCase < numOfTestCases; testCase++) { 
			int capacity = sc.nextInt();

			int numItems = sc.nextInt();
			int[] items = new int[numItems];

			for (int i=0; i<numItems; i++) {
				items[i] = sc.nextInt();
			}

			int[] result = bestItems(capacity, items);

			if (result.length == 0) {
				System.out.println("Cannot fill to capacity.");
			} else {
				Arrays.sort(result);
				System.out.println("This run uses: " + Arrays.toString(result));
			}

		}

		sc.close();
	}
}


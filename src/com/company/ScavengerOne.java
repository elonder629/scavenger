package com.company;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class ScavengerOne {
	public static int cpcity = 100;
	public static Array findingAvailable[];
	//^^keeps track of avaliables and values closest to zero dunno if it's actually necessary
		private static int[] bestItems(int capacity, int[] available) throws IOException {
		capacity = cpcity;
		Scanner sf = new Scanner(new File("01.in"));
		int maxIndx = -1;
		String weightString[] = new String[100]; //REMEMBER weightNum is still a stringArray
		while (sf.hasNext()) {
			maxIndx++;
			weightString[maxIndx] = sf.nextLine();
		}
		sf.close(); //this just reads from the file no need to change here

		//Replace all doesn't work here use split method?? ex: stringNam = s.split("\\s") <--isn't what i need rip
		//reference:
		//String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

		int[] weightNum = new int[weightString.length];
		//setting amount of indexes to the length of weightString
		for (int i = 0; i < weightString.length; i++) {
			weightNum[i] = Integer.parseInt(weightString[i]); //??this is the problem

		}

		int a = 0;
		int b = 1;
		for (int i = 0; i == weightNum.length && available[i] >= 0; i++) { //need to check the math over
			available[i] = capacity - (weightNum[a] + weightNum[b]); //100-indexes
			a += 2;
			b += 2;
			i++; //count for how many items
			if (available[i] == 0) {
			}

			// YOUR CODE IN HERE
			//
			// Your code should return the weights of the items that Rey should load in the speeder
			// If there is no subset of the items that adds up to the "capacity", it should return an empty array

			//01.in is the weights
			//the max capacity is 100
			//if statement when <=100


			// YOUR CODE IN HERE
		}
		return new int[0];
	}
	}
	public static void main(String[] args) throws IOException {
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


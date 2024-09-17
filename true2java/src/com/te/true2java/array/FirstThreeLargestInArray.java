package com.te.true2java.array;

public class FirstThreeLargestInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 354, 4, 5, 6, 7, 8, 9, 89 };
		threeLargest(arr);
	}

	private static void threeLargest(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		int thirdLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > thirdLargest) {
				thirdLargest = arr[i];
				if (thirdLargest > secondLargest) {
					int temp = thirdLargest;
					thirdLargest = secondLargest;
					secondLargest = temp;
					if (secondLargest > firstLargest) {
						int temp1 = firstLargest;
						firstLargest = secondLargest;
						secondLargest = temp1;
					}
				}
			}
		}
		System.out.println(firstLargest + " " + secondLargest + " " + thirdLargest);
	}
}

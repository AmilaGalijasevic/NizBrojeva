package niz;

import java.util.Arrays;

public class NizBrojeva {
	public static int minNum(int[] a) {
		Arrays.sort(a);
		int min = a[0];
		return min;
	}

	public static int maxNum(int[] a) {
		Arrays.sort(a);
		int max = a[9];
		return max;
	}

	public static int sum(int[] a) {

		return 0;
	}

	public static int average(int[] a) {

		return 0;
	}

	public static int unique(int[] a) {
		// mijenjajte sebi metode kako vam odgovara
		return 0;
	}

	public static int sorting(int[] a) {

		return 0;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter 10 numbers in array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println(minNum(array));
		System.out.println(maxNum(array));
	}

}

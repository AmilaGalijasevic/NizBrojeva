package niz;

import java.util.Arrays;

public class NizBrojeva {
	public static int minNum(int[] a) {
		// sorts the array
		Arrays.sort(a);
		int min = a[0];
		// returns min number
		return min;
	}

	public static int maxNum(int[] a) {
		// comment bla bla
		Arrays.sort(a);
		int max = a[9];
		return max;
	}

	public static int sum(int[] a) {
		int suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma = suma + a[i];
		}
		return suma;
	}

	public static int average(int[] a) {
		int sum = 0;
		int average;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		average = (sum / a.length);
		return average;
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
		System.out.println(sum(array));
		System.out.println(average(array));
	}

}

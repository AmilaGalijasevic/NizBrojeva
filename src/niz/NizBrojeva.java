package niz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

	// Unikatni brojevi
	public static ArrayList<Integer> unique(int[] niz) {
		ArrayList<Integer> unikatni = new ArrayList<Integer>();
		int count = 0;

		for (int i = 0; i < niz.length - 1; i++) {
				// ako su komsije iste zabiljezimo u count++ i poredimo slijedece
				// komsije
				if (niz[i] == niz[i+1]) {
					count++;
				} else {
					if(count == 0){
					unikatni.add(niz[i]);
					}else {
					count=0;
					}
				}
		}
		
		//Provjera za zadnji clan u nizu
		if(niz[niz.length - 2] != niz[niz.length - 1]){
			unikatni.add(niz[niz.length - 1]);
		}

		return unikatni;
	}
	//Sortirani niz od najmanjeg ka najvecem
	public static int [] sorting(int[] a) {
		int[] niz=a;
		Arrays.sort(niz);
		return niz;
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
		System.out.println(unique(array));
		array=sorting(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
		}
		
	}

}

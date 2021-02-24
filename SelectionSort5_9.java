import java.util.*;
import java.io.*;
package src.ep1;

public class SelectionSort5_9 {
	static void selectionSort (String arr[],int n) {
		for(int i = 0; i < n - 1; i++) {
			int min_index = i;
			String minStr = arr[i];
			for(int j = i + 1; j < n; j++) {
				if(arr[j].compareTo(minStr) < 0) {
					minStr = arr [j];
					min_index = j;
				}
			}
			if(min_index !=i) {
				String temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main (String args[]) {
		String arr[] = {"Person One", "Person Two", "Person Three"};
		int n = arr.length;
		System.out.println("Given array is");
		for(int i = 0; i < n; i++) {
			System.out.println(i+": "+arr[i]);
		}
		System.out.println();
		selectionSort(arr, n);
		System.out.println("Sorted array is");
		for(int i = 0; i < n; i++) {
			System.out.println(i+": "+arr[i]);
		}
	}
}

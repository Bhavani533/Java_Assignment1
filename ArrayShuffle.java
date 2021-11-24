package javaArray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArrayShuffle {
	public static void shuffle(int[] arr) {
		for(int i =arr.length-1;i>=0;i--)
		{
			Random rand = new Random();
			int j = rand.nextInt(i+1);
			shuf(arr, i, j);
		}

	}
	private static void shuf(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]) {
		int i;
		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are :"+Arrays.toString(arr));
		shuffle(arr);
		
		System.out.println("Shuffle array : "+Arrays.toString(arr));
		sc.close();	
	}
	
	
}

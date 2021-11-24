package javaArray;
import java.util.Scanner;
public class ArrayAverage {
	public static void main(String args[]) {
		int sum = 0;
		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i =0;i<n;i++)
		{
			sum = sum+arr[i];
		}
		System.out.println("The average of array elements are :");
		System.out.print(sum/n);
		sc.close();
	}
}

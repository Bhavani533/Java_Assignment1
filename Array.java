package javaArray;
import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are :");
		for(int i =0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
	 

}

package javaArray;
import java.util.Scanner;
public class ReplaceArraySum {
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
		System.out.println("The sum of all other elements of the array are :");
		for(int i =0;i<n;i++)
		{
			sum = sum+arr[i];
			arr[i] = sum;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}

package javaArray;
import java.util.Scanner;
public class ArrayProduct {
	public static void main(String args[]) {
		int mul = 1;
		System.out.println("Enter the number of elements : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The product of array elements are :");
		for(int i =0;i<n;i++)
		{
			mul = mul * arr[i];
		}
		System.out.print(mul);
		sc.close();
	}
}

package javaArray;
import java.util.Scanner;
public class ArraySecondLargest {
	public static void main(String args[]) {
		int temp;
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
		System.out.println("The second largest number is :");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[n-2]);
		sc.close();
	}
}

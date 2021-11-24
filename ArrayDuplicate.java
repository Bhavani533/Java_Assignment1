package javaArray;
import java.util.Scanner;
public class ArrayDuplicate {
	public static void main(String args[]) {
		int count = 0;
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
		System.out.println("The duplicate elements in array are : ");
		for(int i =0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		System.out.print(count);
		sc.close();
	}

}

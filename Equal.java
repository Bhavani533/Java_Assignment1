package javaStrings;
import java.util.Scanner;
public class Equal {
	public static void main(String args[]) {
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter second string : ");
		String s2 = sc.next();
		boolean s3 = s1.equals(s2);
		if(s3==true)
		{
			System.out.println("The two strings are equal");
		}
		else {
			System.out.println("The two strings are not equal");
		}
		
		sc.close();
	}
	
}

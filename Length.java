package javaStrings;
import java.util.Scanner;
public class Length {
	public static void main(String args[]) {
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("The length of the string is : "+str.length());
		sc.close();
	}
	
	
}

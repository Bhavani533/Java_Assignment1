package javaStrings;
import java.util.Scanner;
public class Concatenate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string : ");
		String s1 = sc.next();
		System.out.println("Enter the second string : ");
		String s2 = sc.next();
		System.out.println("The concatenation of two strings is : "+s1.concat(s2));
		sc.close();
	}
}

package javaStrings;
import java.util.Scanner;
public class Substring {
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter second string : ");
		String s2 = sc.next();
		boolean res = s1.contains(s2);
		if(res) {
			System.out.println(s2 +" is substring of "+s1);
		}
		else {
			System.out.println(s2 +" is not substring of "+s1);
		}
		sc.close();
	}

}

package javaStrings;
import java.util.Arrays;
import java.util.Scanner;
public class Sort {
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
		sc.close();
	}

}

package javaStrings;
import java.util.Scanner;
public class GetChar {
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter index number : ");
		int i = sc.nextInt();
		System.out.println(str.charAt(i));
		sc.close();
		
	}

}

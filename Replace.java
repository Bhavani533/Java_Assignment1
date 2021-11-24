package javaStrings;
import java.util.Scanner;
public class Replace {
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Enter index number : ");
		int i = sc.nextInt();
		System.out.println("Enter the charater to replace : ");
		char ch = sc.next().charAt(0);
		char[] chars = str.toCharArray();
		chars[i]=ch;
		str = String.copyValueOf(chars);
		System.out.println(str);
		sc.close();
	}

}

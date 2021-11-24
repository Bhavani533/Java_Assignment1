package javaStrings;
import java.util.Scanner;
public class Iterate {
	public static void main(String args[])
	{
		System.out.println("Enter the sentence : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			System.out.print(s1.charAt(i)+ " ");
		}
		sc.close();
	}

}

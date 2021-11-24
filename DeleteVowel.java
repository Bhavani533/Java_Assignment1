package javaStrings;
import java.util.Scanner;
public class DeleteVowel {
	public static void main(String args[])
	{
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println("The string without vowels is : "+str1);
		sc.close();
	}

}

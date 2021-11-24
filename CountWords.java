package javaStrings;
import java.util.Scanner;
public class CountWords {
	public static void main(String args[]) {
		System.out.println("Enter the sentence : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Number of words : "+s1.split(" ").length);
		sc.close();
	}
}

package javaStrings;
import java.util.Random;
import java.util.Scanner;
public class RandomStr {
	public static void main(String args[])
	{
		String Alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		System.out.println("Enter the length : ");
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		for(int i =0; i<l;i++) {
			int index = rand.nextInt(Alphanum.length());
			char randChar = Alphanum.charAt(index);
			sb.append(randChar);
		}
		String randStr = sb.toString();
		System.out.println("Random string is : "+randStr);
	}
}

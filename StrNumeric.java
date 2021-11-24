package javaStrings;
import java.util.Scanner;
public class StrNumeric {
	public static void main(String args[]) {
		System.out.println("Enter the sentence : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		boolean num = true;
		try {
			Double num1 = Double.parseDouble(s1);
			
		}
		catch(NumberFormatException e)
		{
			num = false;
		}
		if(num)
		{
			System.out.println(s1 +" is a number");
		}
		else {
			System.out.println(s1 +" is not a number");
		}
		sc.close();
	}
	
	

}

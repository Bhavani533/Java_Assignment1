package java2;
import java.util.Scanner;
public class Positive {
	public static void main(String args[]) {
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = b.nextInt();
		if(num<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is positive");
		}
	}
}

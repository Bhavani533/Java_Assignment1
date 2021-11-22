package java2;
import java.util.Scanner;

public class Even {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		if(num%2==0) {
			System.out.println("The number is even");
			
			
		}
		else {
			System.out.println("The number is odd");
		}
	}

}

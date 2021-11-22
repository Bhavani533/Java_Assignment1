package java2;
import java.util.Scanner;
public class ReadNumber {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = a.nextInt();
		a.close();
		System.out.println("The entered number is :"+num);
	}

}

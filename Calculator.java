package java2;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		char operator;
		double num1,num2, res;
		Scanner a = new Scanner(System.in);
		System.out.println("Choose an operator : +,-,*, or /");
		operator = a.next().charAt(0);
		System.out.println("Enter first number");
		num1 = a.nextDouble();
		System.out.println("Enter second number");
		num2 = a.nextDouble();
		switch (operator) {
		case '+':
			res = num1 + num2;
			System.out.println(num1 + " + "+ num2 + " = " + res);
			break;
		case '-':
			res = num1 - num2;
			System.out.println(num1 + " - "+ num2 + " = " + res);
			break;
		case '*':
			res = num1 * num2;
			System.out.println(num1 + " * "+ num2 + " = " + res);
			break;
		case '/':
			res = num1 / num2;
			System.out.println(num1 + " / "+ num2 + " = " + res);
			break;
		default:
			System.out.println("Invalid syntax");
			break;			
		}
		a.close();
	}

}

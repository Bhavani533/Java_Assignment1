package java2;

public class Swap {
	public static void main(String args[])
	{
		int a = 10; 
		int b = 20;
		System.out.println("Before swap");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swap");
		System.out.println("The value of a is:"+a);
		System.out.println("The value of b is:"+b);
	}

}

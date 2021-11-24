package javaStrings;
import java.util.Scanner;
public class Swap {
	public static String swapPair(String str)
	{
		if(str == null || str.isEmpty())
		{
			return str;
		}
		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length-1;i += 2)
		{
			char temp = ch[i];
			ch[i] = ch[i+1];
			ch[i+1] = temp;
		}
		return new String(ch);
	}
	public static void main(String args[])
	{
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(swapPair(str));
		sc.close();
	}

}

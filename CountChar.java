package javaStrings;
import java.util.Scanner;
public class CountChar {
	public static void main(String args[])
	{
		int count[] = new int[256];
		System.out.println("Enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i =0;i<str.length();i++)
		{
			count[(int) str.charAt(i)]++;
		}
		for(int i=0;i < 256;i++)
		{
			if(count[i] != 0)
			{
				System.out.println((char) i + " : "+count[i]);
			}
		}
		sc.close();
	}

}

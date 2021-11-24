package javaStrings;
public class Reverse {
	public static void main(String args[]) {
		String s1[] = "The mangoes are sweet".split(" ");
		String s2 = " ";
		for(int i= s1.length-1;i>=0;i--)
		{
			s2 += s1[i] + " ";
		}
		System.out.println("The reverse of the string is : "+s2);
	}

}

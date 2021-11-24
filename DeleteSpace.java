package javaStrings;
public class DeleteSpace {
	public static void main(String args[])
	{
		String str = "  hi hello  ";
		str = str.replaceAll("\\s", "");
		System.out.println("The string without space is : "+str);
	}
	
}

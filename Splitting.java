package javaStrings;

public class Splitting {
	public static void main(String args[])
	{
		String str = "HI HELLO";
		String[] temp;
		String delimiter = " ";
		temp = str.split(delimiter);
		for(int i=0; i<temp.length ; i++)
		{
			System.out.println(temp[i]);
			System.out.println("");
			str = "HI HELLO";
			delimiter = " ";
			temp = str.split(delimiter);
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
			System.out.println("");
			temp = str.split(delimiter,2);
			for(int j=0;j<temp.length;j++)
			{
				System.out.println(temp[i]);
			}
		}
	}
}

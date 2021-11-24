package javaStrings;
public class FirstLetter {
	public static void main(String args[]) {
		String str = "Welcome to AriGlobal";
		char ch[] = str.toCharArray();
		System.out.println("The first character of each word : ");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' '&& (i==0||ch[i-1]==' ')){
				System.out.println(ch[i]);
			}
		}
	}

}

package javaStrings;
import java.util.Scanner;
public class Capital {
	public static void main(String args[])
	{
		System.out.println("Enter the sentence : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		char[] ch = s1.toCharArray();
		boolean space = true;
		for(int i =0; i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				if(space) {
					ch[i] = Character.toUpperCase(ch[i]);
					space = false;
				}
			}
			else {
				space = true;
			}
		}
		s1 = String.valueOf(ch);
		System.out.println(s1);
		sc.close();
	}

}

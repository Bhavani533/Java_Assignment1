package javaStrings;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String args[])
	{
		System.out.println("Ente the first string : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println("Enter the second string : ");
		String s2 = sc.next();
		s1 = s1.replaceAll("\\s", "");
		s2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if(s1.length()!= s2.length()) {
			status = false;
		}
		else {
			char[] arrs1 = s1.toLowerCase().toCharArray();
			char[] arrs2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrs1);
			Arrays.sort(arrs2);
			status = Arrays.equals(arrs1, arrs2);
		}
		if(status) {
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else {
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
		sc.close();
	}

}

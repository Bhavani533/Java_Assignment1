package javaStrings;
import java.util.Scanner;
public class Compare {
	public static void main(String args[]){
		System.out.println("Enter first string : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Enter second string : ");
		String str2 = sc.next();

        if(str1.equals(str2)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        sc.close();
	}

}

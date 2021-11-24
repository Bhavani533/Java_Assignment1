package javaStrings;

public class Insert {
	public static void main(String[] args) {
		
		String str1 = "Welcome ArisGlobal";
		String str2 = "to ";
		int index = 7;
	    StringBuffer resString = new StringBuffer(str1);
	    resString.insert(index + 1, str2);
	    System.out.println("Resultant String = "+resString.toString());
	   }
}

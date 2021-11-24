package javaStrings;

public class DeleteWord {
	public static void main(String args[]) {
		String s1 = "She is very good";
		s1 = s1.replaceAll("very", "");
		s1 = s1.trim();
		System.out.println("The string is : "+s1);

	}

}

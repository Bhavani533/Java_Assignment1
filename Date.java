package javaStrings;
import java.text.SimpleDateFormat;
public class Date {
	public static void main(String args[])throws Exception
	{
		String date = "30/12/2000";
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		java.util.Date d1 = f1.parse(date);
		System.out.println(date + "\t" +d1);
	}

}

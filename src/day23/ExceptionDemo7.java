package day23;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {

	public static void main(String[] args) {//its not good practice to throw exception in main method but exceptions can be handles here.
		Date date =  new Date();
		System.out.println(date);
		parseDateToString(date);
		String d = "2012-01-13";
		System.out.println(d);
		try {
			parseStringToDate(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void parseDateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat();
		String formattedDate = sdf.format(date);
		System.out.println(formattedDate);
		
	}
	public static void parseStringToDate(String d) throws ParseException {//throws only removed exception but it did not handle it. throws can be used for unchecked exceptions to but its better to use only for checked exceptions.
		SimpleDateFormat sdf = new SimpleDateFormat("YY-mm-dd");
		Date date = sdf.parse(d);//the exception that extends exception directly is called checked exception
		System.out.println(date);
	}

}

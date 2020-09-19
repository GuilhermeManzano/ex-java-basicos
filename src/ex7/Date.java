package ex7;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.text.ParseException;

public class Date {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf2.parse("25/06/2018 15:42:07");

		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		Calendar cal = Calendar.getInstance();

		
		System.out.println(sdf2.format(d));
	}

	private static Date from(Instant parse) {
		// TODO Auto-generated method stub
		return null;
	}
}

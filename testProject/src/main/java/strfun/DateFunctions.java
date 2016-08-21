package strfun;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFunctions {
// date functions
	public static void main(String[] args) {
		Date currentdate=new Date();
		System.out.println(currentdate);
		DateFormat format=new SimpleDateFormat("dd/MM/YYYY hh:mm:ss:SSS");
		String datestring=format.format(currentdate);
		System.out.println(datestring);

	}

}

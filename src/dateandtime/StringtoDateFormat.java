package dateandtime;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class StringtoDateFormat {

	public static void main(String[] args) throws Exception {
		//Date d=DateFormat.getDateInstance().parse("11 July,2024");
		Date d = DateFormat.getDateInstance().parse("2024-07-11");  
		//Date d1=DateFormat.getDateInstance().parse("Mar-2015");
		System.out.println(d);
		

	}

}

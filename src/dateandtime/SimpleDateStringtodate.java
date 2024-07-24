package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateStringtodate {

	public static void main(String[] args) throws Exception {
		// String to date
		try {
			SimpleDateFormat sdt=new SimpleDateFormat("YYYY/MM/DD");
			Date d=sdt.parse("2024/07/11");
			System.out.println(d);
		} catch (ParseException e) {

			e.printStackTrace();
		}
	}

}

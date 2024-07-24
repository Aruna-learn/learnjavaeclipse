package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateandTime {

	public static void main(String[] args) {
		// Date to string
		Date d=new Date();
		SimpleDateFormat sdt=new SimpleDateFormat("yyyy/MM/dd");
		String dt=sdt.format(d);
		System.out.println(dt);
		
		sdt=new SimpleDateFormat("yyyy MMMM dd zzzz");
		String dt1=sdt.format(d);
		System.out.println(dt1);
		
		sdt=new SimpleDateFormat("yyyy MMMM dd: HH:mm:ss zzzz");
		String dt2=sdt.format(d);
		System.out.println(dt2);
		
		
	}

}

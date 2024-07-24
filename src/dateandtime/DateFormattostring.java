package dateandtime;

import java.util.Date;

public class DateFormattostring {

	public static void main(String[] args) {
		Date d=new Date();
		//Date to string -Formatter
		System.out.println("currentdate is:"+d);//currentdate is:Thu Jul 11 10:23:27 IST 2024
		
		String sdt=java.text.DateFormat.getInstance().format(d);
			System.out.println(sdt);	//11/07/24, 10:23 am


			sdt=java.text.DateFormat.getDateInstance().format(d);
			System.out.println(sdt);	//11-Jul-2024

			
			
			sdt=java.text.DateFormat.getDateTimeInstance().format(d);
			System.out.println(sdt);	//11-Jul-2024, 10:23:27 am

			
			
			sdt=java.text.DateFormat.getTimeInstance().format(d);
			System.out.println(sdt);	//10:23:27 am

			
			
			sdt=java.text.DateFormat.getDateInstance(0).format(d);
			System.out.println(sdt);	//Thursday, 11 July, 2024

			
			
			sdt=java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT).format(d);
			System.out.println(sdt);//	10:23 am

			
			sdt=java.text.DateFormat.getTimeInstance(java.text.DateFormat.MEDIUM).format(d);
			System.out.println(sdt);//10:23:27 am

			
			sdt=java.text.DateFormat.getTimeInstance(java.text.DateFormat.LONG).format(d);
			System.out.println(sdt);//10:23:27 am IST

			
			
			
			
			
			
			
			
			
	}

}

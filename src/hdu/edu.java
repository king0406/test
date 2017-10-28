package hdu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class edu {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		cal.add(Calendar.DAY_OF_MONTH, +30);
		Date date = cal.getTime();  
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		String s = formatter.format(date);  
		System.out.println(date);   
		System.out.println(new java.util.Date(System.currentTimeMillis()));   
		System.out.println(s);  
	}

}

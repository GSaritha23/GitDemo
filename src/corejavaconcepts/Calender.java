package corejavaconcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Calendar cal=Calendar.getInstance();
		
	SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
	System.out.println(sdf1.format(cal.getTime()));
		
		System.out.println(cal.AM_PM);
		System.out.println(cal.getMinimalDaysInFirstWeek());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	
		
	}



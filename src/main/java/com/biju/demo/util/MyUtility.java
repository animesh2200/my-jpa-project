package com.biju.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtility {

	public static String getDate() {
		java.util.Date date = new Date("Sat Dec 01 00:00:00 GMT 2012");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String format = formatter.format(date);
		return format;
	}

}

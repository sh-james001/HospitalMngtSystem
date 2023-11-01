package org.ass.hospital_management_system.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

public static Date stringToDate(String date) {
	Date parsedDate=null;
	
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    try {
         parsedDate = dateFormat.parse(date);
    } catch (ParseException e) {
        e.printStackTrace();
    }
    return parsedDate;
}
}

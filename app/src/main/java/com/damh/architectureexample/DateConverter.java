package com.damh.architectureexample;

import androidx.room.TypeConverter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {

    @TypeConverter
    public static Date toDate(String stringdate){
        return stringdate == null ? null : new Date(stringdate);
    }

    @TypeConverter
    public static String toTimestamp(Date date){
        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yy");
        return dateTimeFormat.format(date);
    }

}

//微信：egvh56ufy7hh ，QQ：821898835 package com.hospital.uitls;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static String date2String(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd");
        return sdf.format(date);
    }
}

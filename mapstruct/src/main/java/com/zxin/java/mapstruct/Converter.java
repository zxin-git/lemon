package com.zxin.java.mapstruct;

import java.time.DayOfWeek;

/**
 * @author zxin
 */
public class Converter {

    public static String toString(DayOfWeek dayOfWeek){
        return dayOfWeek.ordinal()+"";
    }

}

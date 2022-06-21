package com.example.dynamodb.util;

import static java.time.ZoneId.of;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateFunctions {

    public static Long getActualTimeLong() {
        ZonedDateTime zdt = ZonedDateTime.now(of("America/Bogota"));
        long offsetMillis = ZoneOffset.from(zdt).getTotalSeconds() * 1000L;
        long isoMillis = zdt.toInstant().toEpochMilli();
        Date date = new Date(isoMillis + offsetMillis);
        return date.getTime();
    }

}

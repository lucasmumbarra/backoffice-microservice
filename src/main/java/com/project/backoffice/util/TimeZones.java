package com.project.backoffice.util;

import java.time.ZoneId;
import java.util.TimeZone;

public class TimeZones {

    private static final String SAO_PAULO = "America/Sao_Paulo";
    private static final String UTC = "UTC";
    
    public static void setDefault() {
        TimeZone.setDefault(TimeZone.getTimeZone(SAO_PAULO));
    }

    public static void setUTC() {
        TimeZone.setDefault(TimeZone.getTimeZone(UTC));
    }

    public static ZoneId getDefault() {
        return ZoneId.of(SAO_PAULO);
    }

    public static ZoneId getUtc() {
        return ZoneId.of(UTC);
    }
}

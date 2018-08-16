/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test1;

import java.time.*;

/**
 * @author Dhiraj
 * @date 15/08/18
 */
public class TestClass15 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM.
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
        ZoneId nyZone = ZoneId.of("America/New_York");
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        Duration d = Duration.between(nyOdt, nyZdt);
        System.out.println(d);
    }

    /**
     *
     * 2017-06-02T06:00-5:00[America/New_York] 11
     * 2017-06-02T06:00-4:00[America/New_York] 10
     *
     */
}

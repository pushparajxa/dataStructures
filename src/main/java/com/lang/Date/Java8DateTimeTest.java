
package com.lang.Date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Java8DateTimeTest {

  public static void main(String[] args) {

    Clock clock = Clock.system(ZoneId.of("Asia/Kolkata"));
    Instant instant = clock.instant();
    System.out.println(clock.millis()+"  "+System.currentTimeMillis());
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm:ss");
    LocalDateTime parse = LocalDateTime.parse("2019-01-31 17:24:20",formatter);
    System.out.println(parse);
  }


}

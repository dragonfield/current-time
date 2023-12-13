package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Profile({"test", "it", "dev"})
@RequiredArgsConstructor
@Component
public class DevelopmentEnvironment implements Environment {

  private static final Clock clock = Clock.fixed(Instant.parse("2023-12-13T00:00:00Z"), ZoneId.of("Asia/Tokyo"));

  public String getCurrentTime() {
    LocalDateTime current = LocalDateTime.now(clock);
    return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").format(current);
  }

}

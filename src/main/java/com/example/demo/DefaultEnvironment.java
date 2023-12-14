package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@RequiredArgsConstructor
@Component
public class DefaultEnvironment implements Environment {

  private final Clock clock;

  public String getCurrentTime() {
    return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").format(LocalDateTime.now(clock));
  }

}

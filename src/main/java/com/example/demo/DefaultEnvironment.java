package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Profile({"default", "pr"})
@RequiredArgsConstructor
@Component
public class DefaultEnvironment implements Environment {

  private static final Clock clock = Clock.system(ZoneId.of("Asia/Tokyo"));

  public String getCurrentTime() {
    return DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").format(LocalDateTime.now(clock));
  }

}

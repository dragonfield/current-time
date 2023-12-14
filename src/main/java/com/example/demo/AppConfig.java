package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

@Configuration
public class AppConfig {

  @Profile({"default", "pr"})
  @Bean
  public Clock defaultClock() {
    return Clock.system(ZoneId.of("Asia/Tokyo"));
  }

  @Profile({"test", "it", "dev"})
  @Bean
  public Clock developmentClock() {
    return Clock.fixed(Instant.parse("2023-12-13T00:00:00Z"), ZoneId.of("Asia/Tokyo"));
  }

}

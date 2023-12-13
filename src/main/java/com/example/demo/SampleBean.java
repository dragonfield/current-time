package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class SampleBean {

  private final Environment environment;

  public String message() {
    return "Hello " + environment.getCurrentTime();
  }

}

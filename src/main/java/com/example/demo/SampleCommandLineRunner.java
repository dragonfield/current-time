package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class SampleCommandLineRunner implements CommandLineRunner {

  private final SampleBean sampleBean;

  @Override
  public void run(String... args) throws Exception {
    log.info(sampleBean.message());
  }

}

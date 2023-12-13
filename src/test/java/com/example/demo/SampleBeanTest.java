package com.example.demo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class SampleBeanTest {

  @Autowired
  private SampleBean sut;

  @Test
  void test() {
    // setup

    // execute
    String actual = sut.message();

    // assert
    String expected = "Hello 2023/12/13 09:00";
    assertThat(actual).isEqualTo(expected);
  }

}
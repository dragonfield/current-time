package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

class DefaultEnvironmentTest {

  @InjectMocks
  private DefaultEnvironment sut;

  @Mock
  private Clock clock;

  @BeforeEach
  void setUp() {
    MockitoAnnotations.openMocks(this);
  }

  @Test
  void test() {
    // setup
    when(clock.instant()).thenReturn(Instant.parse("2023-12-13T00:00:00Z"));
    when(clock.getZone()).thenReturn(ZoneId.of("Asia/Tokyo"));

    // execute
    String actual = sut.getCurrentTime();

    // assert
    String expected = "2023/12/13 09:00";
    assertThat(actual).isEqualTo(expected);
  }

}
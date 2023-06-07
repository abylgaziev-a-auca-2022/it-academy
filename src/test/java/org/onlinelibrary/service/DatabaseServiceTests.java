package org.onlinelibrary.service;

import static org.junit.jupiter.api.Assertions.*;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Testing class for database services.
 */
@Slf4j
@SpringBootTest
class DatabaseServiceTests {

  @Autowired
  private DatabaseService databaseService;

  @Test
  void test() {
    fail("Not yet implemented");
  }

}

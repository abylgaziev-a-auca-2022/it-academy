package org.onlinelibrary.service;

import static org.junit.jupiter.api.Assertions.*;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.onlinelibrary.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Testing class for search services.
 */
@Slf4j
@SpringBootTest
class SearchServiceTests {

  @Autowired
  private SearchService searchService;

  @Test
  void testGetSearchResults() {
    List<Account> accounts = (List<Account>) searchService.getSearchResults("", "books", "");
    assertTrue(accounts.size() >= 10);
  }

}

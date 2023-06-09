package org.onlinelibrary.controller;

import lombok.extern.slf4j.Slf4j;
import org.onlinelibrary.model.Book;
import org.onlinelibrary.service.AccountService;
import org.onlinelibrary.service.BookService;
import org.onlinelibrary.view.TemplateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class BookController extends TemplateView {

  private final AccountService accountService;
  private final BookService bookService;

  @Autowired
  public BookController(AccountService accountService,
                        BookService bookService) {
    this.accountService = accountService;
    this.bookService = bookService;
  }

  @GetMapping("/books")
  public String getBooks() {
    return "redirect:/search";
  }

  @GetMapping("/books/{id}")
  public String getBook(Model model, @PathVariable Integer id) {
    Book book = bookService.getById(id);
    model.addAttribute("book", book);

    if (accountService.isLoggedIn()) {
      model.addAttribute("lists", accountService.getLoggedInAccount().getCatalogs());
    }

    return loadView(model, "books/book");
  }

  @GetMapping("/books/{id}/read")
  public String getBookReader(@RequestParam(required=false) String book) {
    return "books/bibi";
  }

}

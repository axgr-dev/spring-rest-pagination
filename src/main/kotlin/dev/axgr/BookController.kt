package dev.axgr

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/books")
class BookController(private val repo: BookRepository) {

  /**
   * http://localhost:8080/books
   * http://localhost:8080/books?page=4
   * http://localhost:8080/books?page=4&sort=title,desc
   * http://localhost:8080/books?page=4&sort=title,desc&size=2
   */

  @GetMapping
  fun page(pageable: Pageable): Page<Book> = repo.findAll(pageable)

}

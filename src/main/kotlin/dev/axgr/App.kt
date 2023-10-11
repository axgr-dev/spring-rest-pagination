package dev.axgr

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class App {

  @Bean
  fun run(repo: BookRepository) = CommandLineRunner {
    (1..100).forEach { index ->
      repo.save(Book().apply {
        title = "Book #$index"
        author = "Author #$index"
        price = index.toBigDecimal()
      })
    }
  }
}

fun main(args: Array<String>) {
  runApplication<App>(*args)
}

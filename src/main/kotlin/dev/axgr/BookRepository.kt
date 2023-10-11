package dev.axgr

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookRepository : PagingAndSortingRepository<Book, UUID>, CrudRepository<Book, UUID>

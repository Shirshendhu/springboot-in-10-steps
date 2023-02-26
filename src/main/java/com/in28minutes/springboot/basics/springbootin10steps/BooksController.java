package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
public class BooksController {

    //need to map: http://localhost:8080/books -> Few hardcoded books

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(
            new Book(1l,"Master Spring 5.0","SP"));
    }
    
}

package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

/*
 * Spring MVC Controller which will associate with Thymeleaf and use JPA to pull data from Hibernate
 */

//Book Controller Annotation - now a Spring Bean
@Controller
public class BookController {

    private BookRepository bookRepository;

    //Constructor
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Request from HTML Thymeleaf
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute( "books", bookRepository.findAll()); //find All is an iterator for Thymeleaf

        return "books";

    }
}

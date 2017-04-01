package com.hendisantika.booklist.web;

import com.hendisantika.booklist.domain.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	
	/**
	 * Show list of all books
	 * 
	 * @param model
	 * @return
	 */
    @RequestMapping(value="/")
    public String studentList(Model model) {	
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
}

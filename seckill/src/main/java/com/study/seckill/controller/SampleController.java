package com.study.seckill.controller;

import com.study.seckill.model.Book;
import com.study.seckill.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ziyuan_deng
 * @create 2020-07-17 16:44
 */
@RestController
@RequestMapping("/test")
public class SampleController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("name","dzy");
        return "hello";
    }

    @PostMapping("/list")
    public Object bookList(){
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;
    }
}

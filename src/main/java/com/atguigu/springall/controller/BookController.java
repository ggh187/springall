package com.atguigu.springall.controller;


import com.atguigu.springall.bean.Book;
import com.atguigu.springall.mapper.BookMapper;
import com.atguigu.springall.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.HashMap;

import java.util.List;
import java.util.Map;

/*************************************************
                时间: 2020-12-01
                作者: 刘  辉
                描述: ds
  ************************************************/
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BookService bookService;


    @RequestMapping("/list")
    public List<Book> getBookList(){
        System.out.println(dataSource.getClass());
        return bookMapper.getBookList();
    }
    @RequestMapping("/insert")
    public Map<String,Object> insert(){
        bookService.insert();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("key1","value1");
        return map;
    }
}

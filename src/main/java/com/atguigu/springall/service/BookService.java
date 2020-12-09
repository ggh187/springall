package com.atguigu.springall.service;

import com.atguigu.springall.bean.Book;
import com.atguigu.springall.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*************************************************
                时间: 2020-12-02
                作者: 刘  辉
                描述: book业务逻辑
  ************************************************/
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    @Transactional
    public void insert(){
        Book book = new Book(null,"昆虫记");
        bookMapper.insert(book);
        int i=10/0;
    }
}

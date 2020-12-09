package com.atguigu.springall.mapper;


import com.atguigu.springall.bean.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/*************************************************
                时间: 2020-12-01
                作者: 刘  辉
                描述: s
  ************************************************/
public interface BookMapper {


    public List<Book> getBookList();

    @Options(useGeneratedKeys = true,keyProperty ="bid" )
    @Insert("insert into book(bookname) values(#{bookname})")
    public void insert(Book book);
}

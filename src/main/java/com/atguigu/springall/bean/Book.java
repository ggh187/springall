package com.atguigu.springall.bean;
/*************************************************
                时间: 2020-12-01
                作者: 刘  辉
                描述: shu
  ************************************************/
public class Book {
    private Integer bid;
    private String bookname;

    public Book() {
    }

    public Book(Integer bid, String bookname) {
        this.bid = bid;
        this.bookname = bookname;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bookname='" + bookname + '\'' +
                '}';
    }
}

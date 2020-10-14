package com.cs.test;

import com.cs.entity.Book;
import com.cs.service.impl.BookServiceImpl;

import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {

        findAll();

//        update();

//        findByid();

    }

    private static void findByid() throws Exception {
        BookServiceImpl bsi = new BookServiceImpl();
        Book b = bsi.findByID(2);
        System.out.println(b.getBookName() + " "
                + b.getBookAuthor() + " " + b.getBookConcern()
                + " " + b.getConcernTime());
    }

    private static void update() throws Exception {
        BookServiceImpl bsi = new BookServiceImpl();
        Book book = new Book();
        book.setId(1);
        book.setState(0);
        book.setLender("机核老白");
        int i = bsi.updateBookInfo(book);
        if (i > 0) {
            System.out.println("借阅成功");
        } else {
            System.out.println("借阅失败");
        }
    }

    private static void findAll() throws Exception {
        BookServiceImpl bsi = new BookServiceImpl();
        List<Book> list = bsi.findBookInfoAll();

        for (Book b : list) {
            System.out.println(b.getId() + " " + b.getBookName() + " "
            + b.getBookAuthor() + " " + b.getBookConcern()
             + " " + b.getConcernTime() + " " + b.getState());
        }
    }
}



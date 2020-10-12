package com.cs.dao.impl;

import com.cs.basedao.BaseDao;
import com.cs.dao.BookDao;
import com.cs.entity.Book;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl extends BaseDao implements BookDao {

    //查询方法
    @Override
    public List<Book> findBookInfoAll() throws Exception {
        List<Book> list = new ArrayList<>();
        String sql = "select * from BOOK where state = 0 ";
        ResultSet rs = execQuery(sql, null);
        while (rs.next()) {
            Book book = new Book();
            book.setId(rs.getInt(1));
            book.setBookName(rs.getString(2));
            book.setBookAuthor(rs.getString(3));
            book.setBookConcern(rs.getString(4));
            book.setConcernTime(rs.getDate(5));
            book.setState(rs.getInt(6));
            list.add(book);
        }
        getClose();
        return list;
//        return null;
    }


    @Override
    public int updateBookInfo(Book book) throws Exception {
        int index = -1;
        String sql = "update book set state = ?,lender = ? where BOOK_ID = ?";
        Object[] obj = {book.getState(), book.getLender(), book.getId()};
        index = execUpdate(sql, obj);
        getClose();
        return index;
//        return 0;
    }

    //根据关键词查询方法
    @Override
    public Book findByID(int id) throws Exception {
        Book book = null;
        String sql = "select * from book where book_id = ?";
        Object[] obj = {id};
        ResultSet rs = execQuery(sql, obj);
        while (rs.next()) {
            book = new Book();
            book.setId(rs.getInt(1));
            book.setBookName(rs.getString(2));
            book.setBookAuthor(rs.getString(3));
            book.setBookConcern(rs.getString(4));
            book.setConcernTime(rs.getDate(5));
            book.setState(rs.getInt(6));
        }
        getClose();
        return book;
//        return null;
    }

}

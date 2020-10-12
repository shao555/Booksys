package com.cs.dao;

import com.cs.entity.Book;

import java.util.List;

public interface BookDao {

    //查询方法
    public List<Book> findBookInfoAll() throws Exception;

    //根据关键词查询方法
    public Book findByID(int id) throws Exception;

    //修改方法
    public int updateBookInfo(Book book) throws Exception;

    //添加关键词方法
//    public int addKeyword(Book keyword) throws Exception;

//    //删除关键词方法
//    public int delKeyword(int id) throws Exception;

}

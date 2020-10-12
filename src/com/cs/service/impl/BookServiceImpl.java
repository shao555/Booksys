package com.cs.service.impl;

import com.cs.dao.impl.BookDaoImpl;
import com.cs.entity.Book;
import com.cs.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    BookDaoImpl bdi = new BookDaoImpl();

    //查询方法
    @Override
    public List<Book> findBookInfoAll() throws Exception {
        return bdi.findBookInfoAll();
//        return null;
    }

    //根据关键词查询方法
    @Override
    public Book findByID(int id) throws Exception {
        return bdi.findByID(id);
//        return null;
    }

    @Override
    public int updateBookInfo(Book book) throws Exception {
        return bdi.updateBookInfo(book);
//        return 0;
    }

    //添加关键词方法
//    @Override
//    public boolean addKeyword(Book keyword) throws Exception {
//        int i = kdi.addKeyword(keyword);
//        if (i > 0) {
//            return true;
//        } else {
//            return false;
//        }
////        return 0;
//    }

    //删除关键词方法
//    @Override
//    public boolean delKeyword(int id) throws Exception {
//        int i = kdi.delKeyword(id);
//        if (i > 0) {
//            return true;
//        } else {
//            return false;
//        }
////        return 0;
//    }
}

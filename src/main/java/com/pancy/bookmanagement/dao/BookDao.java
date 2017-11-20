package com.pancy.bookmanagement.dao;

import com.pancy.bookmanagement.entity.Book;

import java.util.List;

public interface BookDao {
    Book queryById(long id);
    List<Book> querySome(String name);
    List<Book> queryAll(int offset, int limit);

    int reduceNumber(long bookId);
}

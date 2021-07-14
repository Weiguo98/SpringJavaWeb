package com.mszlu.blog.dao;
import java.util.List;

import com.mszlu.blog.domain.Author;

public interface AuthorDao {

    int add(Author author);

    int update(Author author);

    int delete(Long id);

    Author findAuthor(Long id);

    List<Author> findAuthorList();
}


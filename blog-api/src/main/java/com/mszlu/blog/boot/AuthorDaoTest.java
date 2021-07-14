package com.mszlu.blog.boot;

import com.mszlu.blog.BlogApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mszlu.blog.BlogApp;
import com.mszlu.blog.dao.AuthorDao;
import com.mszlu.blog.domain.Author;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BlogApp.class)
public class AuthorDaoTest {

    @Autowired
    private AuthorDao authorDao;

    @Test
    public void testInsert() {
        Author author = new Author();
        author.setId(1L);
        author.setRealName("莫言");
        author.setNickName("疯子");

        authorDao.add(author);
        System.out.println("插入成功！");
    }
}


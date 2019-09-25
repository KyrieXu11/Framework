package com.sys.selectcource;

import com.sys.selectcource.Dao.BookDAO;
import com.sys.selectcource.enities.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SelectcourceApplicationTests {

    @Autowired
    BookDAO bookDAO;

    @Test
    public void contextLoads() {
        Book book=new Book();
        book.setName("三国演义");
        bookDAO.save(book);
    }

    @Test
    public void contextLoads1() {
        Book book=new Book();
        book.setName("西游记");
        bookDAO.saveAndFlush(book);
    }


}

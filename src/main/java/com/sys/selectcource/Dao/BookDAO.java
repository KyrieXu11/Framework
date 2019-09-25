package com.sys.selectcource.Dao;

import com.sys.selectcource.enities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

//  第一个泛型是操作的实体，第二个是主键的类型

public interface BookDAO extends JpaRepository<Book,Integer> {
}

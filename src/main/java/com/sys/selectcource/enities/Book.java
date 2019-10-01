package com.sys.selectcource.enities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "book")
public class Book {
//    设置主键，并且自增
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookid;
    private String name;
}

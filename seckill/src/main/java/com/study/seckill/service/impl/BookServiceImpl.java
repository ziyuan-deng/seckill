package com.study.seckill.service.impl;

import com.study.seckill.mapper.BookMapper;
import com.study.seckill.model.Book;
import com.study.seckill.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ziyuan_deng
 * @create 2020-07-17 18:02
 */
@Service
public class BookServiceImpl  implements BookService {
    @Resource
    private BookMapper bookMapper;
    @Override
    public List<Book> getAllBooks() {
        return bookMapper.selectByExample(null);
    }
}

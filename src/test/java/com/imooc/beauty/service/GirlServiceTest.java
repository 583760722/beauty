package com.imooc.beauty.service;

import com.imooc.beauty.domain.Girl;
import com.imooc.beauty.repository.GirlRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlRepository repository;

    @Autowired
    private GirlService girlService;

    @Test
    @Transactional
    public void  findOneTest() {
        Girl one = repository.getOne(1);
        System.out.println(one);
    }

    @Test
    @Transactional
    public void  findOneTest2() {
//        Girl one = girlService.findOne(1);
//        System.out.println(one);
    }
}
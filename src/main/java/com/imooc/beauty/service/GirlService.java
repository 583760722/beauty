package com.imooc.beauty.service;

import com.imooc.beauty.controller.vo.GirlVO;
import com.imooc.beauty.domain.Girl;
import com.imooc.beauty.repository.GirlRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/16
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GirlService {
    @Autowired
    private GirlRepository repository;

    @Transactional(rollbackFor = Exception.class)
    public GirlVO findOne(Integer id) {

        Girl one = repository.getOne(id);
        GirlVO girlVO = new GirlVO();

        BeanUtils.copyProperties(one, girlVO);
        return girlVO;
    }
}

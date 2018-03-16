package com.imooc.beauty.controller;

import com.imooc.beauty.controller.vo.GirlVO;
import com.imooc.beauty.domain.Girl;
import com.imooc.beauty.properties.GirlProperties;
import com.imooc.beauty.repository.GirlRepository;
import com.imooc.beauty.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/16
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
@RequestMapping("/girls")
public class GirlController {
    @Autowired
    private GirlService service;

    @Autowired
    private GirlRepository repository;

    @Autowired
    private GirlProperties girlProperties;


    @GetMapping("/{id}")
    public GirlVO getGirlById(@PathVariable("id") Integer id) {

        return service.findOne(id);
    }

    @GetMapping("/hello")
    public GirlProperties hello() {
        return girlProperties;
    }

    @PostMapping("/post")
    public Girl addGirl(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return null;
        }
        Girl save = repository.save(girl);
        return save;
    }
}

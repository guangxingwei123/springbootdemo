package com.xuecheng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mumu
 * @date 2021/8/25 - 14:25
 */
@RestController
public class HelloController {
    @GetMapping(value = "hello")
    public String helloworld(){
        return  "helloworld";
    }
}

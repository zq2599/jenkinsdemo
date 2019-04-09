package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
<<<<<<< HEAD
        return "123456.2233445 Hello  jenkins, " + new Date();
=======
        return "学无止境 ~123456. Hello 我草 完成了第一次的修改 +1 这是第二次修改了 jenkins, " + new Date();
>>>>>>> 136e627a0bfd497f066055ff7f4f03037d80b088
    }
}

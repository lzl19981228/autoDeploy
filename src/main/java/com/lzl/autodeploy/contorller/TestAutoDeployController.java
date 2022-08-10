package com.lzl.autodeploy.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : liangzhenlei
 * @Date : 2022/8/9 15:25
 */
@RestController
@RequestMapping("/auto")
public class TestAutoDeployController {


    @GetMapping("/hello")
    public String testHello() {
        return "hello World";
    }

}

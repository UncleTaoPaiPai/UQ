package com.zyz.controller;

import com.zyz.DemoProjectApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/16 - 23:01
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@RestController
@RequestMapping("/api/v1")
public class VideoController {

    //接收，请求数据，控制交互逻辑
    @RequestMapping("list")
    public String lis() {
        return "Hello World";
    }
}

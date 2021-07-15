package com.zyz.controller;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/16 - 0:19
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@RestController
@RequestMapping("/api/v1/video")
public class videoController {

    @RequestMapping("list")
    public Object list() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "aaa");
        map.put("2", "bbb");
        map.put("3", "ccc");
        return map;
    }

}

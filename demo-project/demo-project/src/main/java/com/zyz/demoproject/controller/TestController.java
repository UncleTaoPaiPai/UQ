package com.zyz.demoproject.controller;

import com.zyz.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/11 - 23:27
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@RestController
@RequestMapping("hh")
@PropertySource({"classpath:pay.properties"})
public class TestController {

    @Value("${wxpay.appid}")
    private String payAppid;
    @Value("${wxpay.appid}")
    private String paySecret;

    @GetMapping("get_config")
    public JsonData testConfig() {

        Map<String,String> map = new HashMap<>();
        map.put("appid",payAppid);
        map.put("secret",paySecret);
        return JsonData.buildSuccess(map);
    }
}

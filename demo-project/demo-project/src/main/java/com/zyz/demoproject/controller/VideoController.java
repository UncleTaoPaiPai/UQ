package com.zyz.demoproject.controller;

import com.zyz.demoproject.domain.Video;
import com.zyz.demoproject.mapper.VideoMapper;
import com.zyz.demoproject.service.impl.userServiceimpl;
import com.zyz.demoproject.service.impl.videoServiceimpl;
import com.zyz.demoproject.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/10 - 0:42
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@RestController
@RequestMapping("/hello")
public class VideoController {

    @Autowired
    private videoServiceimpl videoServiceimpl;
    @Autowired
    private userServiceimpl userServiceimpl;

    @GetMapping("world")
    public Object list() {
        List<Video> list = videoServiceimpl.Listvideo();
        return JsonData.buildSuccess(list);
    }

    @GetMapping("man")
    public Object user() {
        return userServiceimpl.listUser();
    }

    @PostMapping("login")
    public JsonData login(String pwd,String username) {
        System.out.println("username = " + username + "pwd = " + pwd);
        System.out.println("sdfd");
        System.out.println("sadjskaldj");
        return JsonData.buildSuccess("");
    }

}

package com.zyz.controller;

import com.zyz.DemoProjectApplication;
import com.zyz.domain.Video;
import com.zyz.service.VideoService;
import com.zyz.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/16 - 23:01
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@RestController
@RequestMapping("/api/v1")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //接收，请求数据，控制交互逻辑
//    @RequestMapping(value = "list",method = RequestMethod.GET)
    @GetMapping("list")
    public Object lis() {
        List<Video> list = videoService.listVideo();
        return list;
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideoChapter(@RequestBody Video video) {
        System.out.println(video.toString());
        return JsonData.buildSuccess("");
    }
}

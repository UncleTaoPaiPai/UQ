package com.zyz.demoproject.mapper;

import com.zyz.demoproject.domain.User;
import com.zyz.demoproject.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/11 - 16:23
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"java视频"));
        videoMap.put(2,new Video(2,"Python视频"));
        videoMap.put(3,new Video(3,"C视频"));
        videoMap.put(4,new Video(4,"C++视频"));
        videoMap.put(5,new Video(5,"Go视频"));
    }

    public List<Video> videoList() {
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }

}

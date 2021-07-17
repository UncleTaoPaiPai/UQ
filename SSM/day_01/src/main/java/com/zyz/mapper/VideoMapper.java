package com.zyz.mapper;

import com.zyz.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 0:36
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@Repository
public class VideoMapper {
    //CURD操作

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1,"海贼王"));
        videoMap.put(2,new Video(2,"火影忍者"));
        videoMap.put(3,new Video(3,"死神"));
    }

    public List<Video> listVideo() {
        List<Video> list = new ArrayList<>();
        list.addAll(videoMap.values());
        return list;
    }

}

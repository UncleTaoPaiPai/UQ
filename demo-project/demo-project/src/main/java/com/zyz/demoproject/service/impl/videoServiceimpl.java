package com.zyz.demoproject.service.impl;

import com.zyz.demoproject.domain.Video;
import com.zyz.demoproject.mapper.VideoMapper;
import com.zyz.demoproject.service.videoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/11 - 0:48
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@Service
public class videoServiceimpl implements videoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> Listvideo() {
        return videoMapper.videoList();
    }
}

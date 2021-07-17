package com.zyz.service.impl;

import com.zyz.domain.Video;
import com.zyz.mapper.VideoMapper;
import com.zyz.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/7/17 - 0:34
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@Service
@Component
public class VideoServiceimpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> listVideo() {
        return videoMapper.listVideo();
    }
}

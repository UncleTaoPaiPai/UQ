package com.zyz.service;

import com.zyz.PageDTO.PageDTO;
import com.zyz.domain.Reply;
import com.zyz.domain.Topic;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:07
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public interface TopicService {

    PageDTO<Topic> listTopicPageCid(int cId,int page, int pageSize);
    Topic findById(int topicId);
    PageDTO<Reply> findReplyPageByTopicId(int topicId, int page, int pageSize);
}

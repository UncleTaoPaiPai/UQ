package com.zyz.service.impl;

import com.zyz.PageDTO.PageDTO;
import com.zyz.dao.ReplyDao;
import com.zyz.dao.TopicDao;
import com.zyz.domain.Reply;
import com.zyz.domain.Topic;
import com.zyz.service.TopicService;

import java.util.List;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:08
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
public class TopicServiceimpl implements TopicService {

    private TopicDao topicDao = new TopicDao();
    private ReplyDao replyDao = new ReplyDao();

    @Override
    public PageDTO<Topic> listTopicPageCid(int cId, int page, int pageSize) {
        int totalRecordNum =  topicDao.countTotalByCid(cId);
        int from = (page - 1) * pageSize;
        List<Topic> topicList =  topicDao.findListByCid(cId,from,pageSize);
        PageDTO<Topic> pageDTO = new PageDTO<>(page,pageSize,totalRecordNum);
        pageDTO.setList(topicList);
        return pageDTO;
    }

    @Override
    public Topic findById(int topicId) {
        return topicDao.findById(topicId);
    }

    @Override
    public PageDTO<Reply> findReplyPageByTopicId(int topicId, int page, int pageSize) {

        int totalRecordNum = replyDao.countTotalReplyByCid(topicId);


        return null;

    }


}

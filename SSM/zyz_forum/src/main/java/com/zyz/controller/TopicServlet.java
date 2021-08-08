package com.zyz.controller;

import com.zyz.PageDTO.PageDTO;
import com.zyz.domain.Topic;
import com.zyz.service.TopicService;
import com.zyz.service.impl.TopicServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:02
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */

@WebServlet(name = "topicServlet",urlPatterns = {"/topic"})
public class TopicServlet extends BaseServlet{

    private TopicServiceimpl topicServiceimpl = new TopicServiceimpl();

    private static final int pageSize = 2;

    public void list(HttpServletRequest request, HttpServletResponse response) {
        int cId = Integer.parseInt(request.getParameter("c_id"));
        int page = 1;
        String currentPage = request.getParameter("page");
        if (currentPage != null && currentPage != "") {
            page = Integer.parseInt(currentPage);
        }
        PageDTO<Topic> pageDTO = topicServiceimpl.listTopicPageCid(cId,page,pageSize);
        System.out.println(pageDTO.toString());
        request.setAttribute("topic",pageDTO);
    }



}

package com.zyz.controller;

import com.zyz.domain.User;
import com.zyz.service.UserService;
import com.zyz.service.impl.UserServiceimpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Auther : YongggzHi
 * @Date : 2021/8/7 - 23:47
 * @Description : IntelliJ IDEA
 * @Version : 1.0
 */
@WebServlet(name = "userServlet",urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {

    private UserServiceimpl userServiceimpl = new UserServiceimpl();

    public void register(HttpServletResponse response, HttpServletRequest request) {

        User user = new User();

        Map<String, String[]> parameterMap = request.getParameterMap();
        try {
            BeanUtils.populate(user,parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        int register = userServiceimpl.register(user);
        if (register < 0) {

        }else {

        }

    }
}

package com.zyz.mapper;

import com.zyz.pojo.Users;
import com.zyz.util.Page;

import java.util.List;

public interface UsersMapper {


    //根据用户编号，查询改用户下。所有的订单，订单详情，商品信息
    Users selectAll(int uid) throws Exception;

    //用于分页，获得一共有多少条数据
    int selectCount() throws Exception;

    //用于分页，获得当前页 显示的集合信息：
    List<Users> selectUserByPage(Page page) throws Exception;


}

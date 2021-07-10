package com.zyz.mapper;

import com.zyz.pojo.Orderdetail;

public interface OrderdetailMapper {


    Orderdetail selectLazyLoadByid(int odid) throws Exception;

}
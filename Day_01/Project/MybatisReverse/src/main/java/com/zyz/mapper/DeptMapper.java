package com.zyz.mapper;

import com.zyz.bean.Dept;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    int deleteByPrimaryKey(Integer deptno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    Dept selectByPrimaryKey(Integer deptno);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbg.generated Thu Feb 18 19:01:38 AEST 2021
     */
    int updateByPrimaryKey(Dept record);
}
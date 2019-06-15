package com.user.demo.dao;

import com.user.demo.bean.User;
import com.user.demo.bean.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int deleteByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    User selectByPrimaryKey(Integer uid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table c_user
     *
     * @mbg.generated Sat Jun 15 10:09:48 CST 2019
     */
    int updateByPrimaryKey(User record);
}
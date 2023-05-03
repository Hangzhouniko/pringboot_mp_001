package com.cqq.dao;

import com.cqq.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getById();

    @Insert("insert into user (name,password,age,tel) values(#{name},#{password},#{age},#{tel})")
    public int save();


}

package com.zc.exercise.provider8081.mapper;

import com.zc.exercise.common.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author zhangchi
 * @date 2019/11/26
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user(user_name,user_pwd,real_name,user_phone,user_email,user_addr) " +
            "values(#{name},#{password}, #{realName}, #{phone}, #{email}, #{address})")
    void insert(User user);

    @Delete("delete from user where user_id = #{id}")
    void delete(@Param("id") Long id);

    @Update("update user set user_name=#{name},user_pwd=#{password},real_name=#{realName}," +
            "user_phone=#{phone},user_email=#{email},user_addr=#{address} where user_id=#{id}")
    void update(User user);

    @Select("select * from user where user_id = #{id}")
    @Results({
            @Result(property = "id", column = "user_id"),
            @Result(property = "name", column = "user_name"),
            @Result(property = "password", column = "user_pwd"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "phone", column = "user_phone"),
            @Result(property = "email", column = "user_email"),
            @Result(property = "address", column = "user_addr")
    })
    User findById(@Param("id") Long id);

    @Select("select * from user")
    @Results({
            @Result(property = "id", column = "user_id"),
            @Result(property = "name", column = "user_name"),
            @Result(property = "password", column = "user_pwd"),
            @Result(property = "realName", column = "real_name"),
            @Result(property = "phone", column = "user_phone"),
            @Result(property = "email", column = "user_email"),
            @Result(property = "address", column = "user_addr")
    })
    List<User> findAll();
}

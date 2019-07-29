package com.cl.secondspringboot.dao;

import com.cl.secondspringboot.pojo.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM user WHERE id = #{id}")
    Person selectUser(int id);//返回一个person对象

    @Select("select * from user order by id")
    ArrayList<Person> selectAllUser();//返回一个person对象

}

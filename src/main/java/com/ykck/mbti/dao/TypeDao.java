package com.ykck.mbti.dao;

import com.ykck.mbti.dto.Type;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TypeDao {

    public Type getTypeById(@Param("type_id")int type_id);

    public Type getTypeByCount(@Param("first_category_id") int first_category_id, @Param("second_category_id") int second_category_id, @Param("third_category_id") int third_category_id);
}

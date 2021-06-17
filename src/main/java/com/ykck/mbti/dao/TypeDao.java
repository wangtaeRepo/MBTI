package com.ykck.mbti.dao;

import com.ykck.mbti.dto.Type;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TypeDao {

    public Type getTypeById(@Param("type_id")int type_id);
}

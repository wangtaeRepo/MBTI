package com.ykck.mbti.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// import com.ykck.mbti.dto.LoginDto;

@Repository
public class LoginDaoImpl implements LoginDao {
    

    @Autowired
    private SqlSession sqlSession;

    final private String nameSpace="com.ykck.mbti.dao.LoginDao";

    @Override
    public String login(String member_Id){  
        return sqlSession.selectOne(nameSpace + ".login" , member_Id);
    }
}

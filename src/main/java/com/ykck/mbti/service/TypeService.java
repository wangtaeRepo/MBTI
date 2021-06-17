package com.ykck.mbti.service;

import com.ykck.mbti.dao.TypeDao;
import com.ykck.mbti.dto.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
    
    @Autowired
    TypeDao typeDao;

    public Type getTypeById(int type_id){
        return typeDao.getTypeById(type_id);
    }

}

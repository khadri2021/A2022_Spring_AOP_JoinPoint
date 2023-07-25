package com.khadri.spring.core.dao;


import org.springframework.stereotype.Component;

@Component
public class StudentDao {

    public Integer findById(Integer id){
        System.out.println("StudentDao : findById "+id);
        return id;
    }
}

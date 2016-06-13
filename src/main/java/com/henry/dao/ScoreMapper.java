package com.henry.dao;

import java.util.List;

import com.henry.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sId);
    
    List<Score> getSocreAndStudent();

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}
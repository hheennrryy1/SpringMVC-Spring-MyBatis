package com.henry.dao;

import com.henry.entity.Score;

public interface ScoreMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}
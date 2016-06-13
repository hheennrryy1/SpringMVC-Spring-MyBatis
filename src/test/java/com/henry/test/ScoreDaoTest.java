package com.henry.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.henry.dao.ScoreMapper;
import com.henry.entity.Score;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Spring.xml", "classpath:Spring-Mybatis.xml"})
public class ScoreDaoTest {
	
	@Autowired
	private ScoreMapper mapper;
	
	@Test
	public void get() {
		List<Score> scores = (ArrayList)mapper.getSocreAndStudent();
		System.out.println(scores.get(0).getStudent().getName());
	}
}

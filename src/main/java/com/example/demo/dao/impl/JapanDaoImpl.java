package com.example.demo.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.JapanDao;
import com.example.demo.vo.Japan;

@Repository
public class JapanDaoImpl implements JapanDao {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Japan> selectJapanList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.example.demo.JAPAN.selectJapan");
	}

	@Override
	public Japan selectOneJapanList(int jpnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertJapan(Japan jp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateJapan(Japan jp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteJapan(int jpnum) {
		// TODO Auto-generated method stub
		return 0;
	}

}

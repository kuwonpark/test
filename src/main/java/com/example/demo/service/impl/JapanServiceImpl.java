package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.impl.JapanDaoImpl;
import com.example.demo.service.JapanService;
import com.example.demo.vo.Japan;

@Service
public class JapanServiceImpl implements JapanService {

	@Autowired
	private JapanDaoImpl jdao;
	
	@Override
	public List<Japan> selectJapanList() {
		// TODO Auto-generated method stub
		return jdao.selectJapanList();
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

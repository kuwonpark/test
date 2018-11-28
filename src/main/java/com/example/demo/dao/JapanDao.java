package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import com.example.demo.vo.Japan;



public interface JapanDao {
	public List<Japan> selectJapanList();
	public Japan selectOneJapanList(int jpnum);
	public int insertJapan (Japan jp);
	public int updateJapan (Japan jp);
	public int deleteJapan (int jpnum);
	
}

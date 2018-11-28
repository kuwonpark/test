package com.example.demo.service;

import java.util.List;

import com.example.demo.vo.Japan;

public interface JapanService {
	public List<Japan> selectJapanList();
	public Japan selectOneJapanList(int jpnum);
	public int insertJapan (Japan jp);
	public int updateJapan (Japan jp);
	public int deleteJapan (int jpnum);
}

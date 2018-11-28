package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JapanService;
import com.example.demo.service.impl.JapanServiceImpl;
import com.example.demo.vo.Japan;

@RestController
public class JapanController {
	
	@Autowired
	private JapanService js;
	
	@GetMapping("/")
	public List<Japan> selectJapanList(){
		
		return js.selectJapanList();
	}

}

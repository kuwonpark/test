package com.example.demo.util;

import org.springframework.stereotype.Service;

@Service
public class Calc {
	
	public int addTest(int num1, int num2) {
		return num1+num2;
	}
	public int minusTest(int num1, int num2) {
		return num1-num2;
	}
	public int multiplyTest(int num1, int num2) {
		return num1*num2;
	}
	public int divisionTest(int num1, int num2) {
		return num1/num2;
	}
}

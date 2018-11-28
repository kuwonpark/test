package com.example.demo.vo;


public class Japan {
	public int jpnum;
	public String jpname;
	public String jpdesc;
	public int getJpnum() {
		return jpnum;
	}
	public void setJpnum(int jpnum) {
		this.jpnum = jpnum;
	}
	public String getJpname() {
		return jpname;
	}
	public void setJpname(String jpname) {
		this.jpname = jpname;
	}
	public String getJpdesc() {
		return jpdesc;
	}
	public void setJpdesc(String jpdesc) {
		this.jpdesc = jpdesc;
	}
	@Override
	public String toString() {
		return "Japan [jpnum=" + jpnum + ", jpname=" + jpname + ", jpdesc=" + jpdesc + "]";
	}

}

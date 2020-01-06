package com.zhaoya.senior1.week2.domain;

import java.math.BigInteger;
public class Company {
   
	private BigInteger id;
	private String keywords;
	private String description;
	private String name;
	private String goods;
	private String addr;
	private String price;
	private String date;
	private String check;
	private String status;
	private String beizhu;
	public BigInteger getId() {
		return id;
	}
	public void setId(BigInteger id) {
		this.id = id;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public Company(BigInteger id, String keywords, String description, String name, String goods, String addr,
			String price, String date, String check, String status, String beizhu) {
		super();
		this.id = id;
		this.keywords = keywords;
		this.description = description;
		this.name = name;
		this.goods = goods;
		this.addr = addr;
		this.price = price;
		this.date = date;
		this.check = check;
		this.status = status;
		this.beizhu = beizhu;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

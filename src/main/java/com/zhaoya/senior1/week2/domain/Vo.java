package com.zhaoya.senior1.week2.domain;

public class Vo {

	private String id;
	private String keywords;
	private String description;
	private String name;
	private String goods;
	private String addr;
	private String startPrice;
	private String endPrice;
	private String startDate;
	private String endDate;
	private String startCheck;
	private String endCheck;
	private String status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartCheck() {
		return startCheck;
	}
	public void setStartCheck(String startCheck) {
		this.startCheck = startCheck;
	}
	public String getEndCheck() {
		return endCheck;
	}
	public void setEndCheck(String endCheck) {
		this.endCheck = endCheck;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Vo(String id, String keywords, String description, String name, String goods, String addr, String startPrice,
			String endPrice, String startDate, String endDate, String startCheck, String endCheck, String status) {
		super();
		this.id = id;
		this.keywords = keywords;
		this.description = description;
		this.name = name;
		this.goods = goods;
		this.addr = addr;
		this.startPrice = startPrice;
		this.endPrice = endPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startCheck = startCheck;
		this.endCheck = endCheck;
		this.status = status;
	}
	public Vo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

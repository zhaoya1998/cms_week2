package com.zhaoya.senior1.week2.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zhaoya.senior1.week2.domain.Company;
import com.zhaoya.senior1.week2.domain.Vo;

public interface CompanyMapper {

	ArrayList<Company> getCompanyList(Vo vo);
	
	int insert(List<Company> list);

	void update(Company company);

	Company getCompanyById(@Param("id")Integer id);

}

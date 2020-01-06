package com.zhaoya.senior1.week2.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhaoya.senior1.week2.domain.Company;
import com.zhaoya.senior1.week2.domain.Vo;

public interface CompanyService {

	PageInfo<Company> getCompanyList(Vo vo, int pageNum);

	int insert(List<Company> list);

	void update(Company company);

	Company getCompanyById(Integer id);

}

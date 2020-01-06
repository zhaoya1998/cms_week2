package com.zhaoya.senior1.week2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhaoya.senior1.week2.dao.CompanyMapper;
import com.zhaoya.senior1.week2.domain.Company;
import com.zhaoya.senior1.week2.domain.Vo;
import com.zhaoya.senior1.week2.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyMapper mapper;
	public PageInfo<Company> getCompanyList(Vo vo, int pageNum) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, 8);
		ArrayList<Company> list=mapper.getCompanyList(vo);
		return new PageInfo<Company>(list);
	}
	public int insert(List<Company> list) {
		// TODO Auto-generated method stub
		return mapper.insert(list);
	}
	@Override
	public void update(Company company) {
		// TODO Auto-generated method stub
		mapper.update(company);
	}
	@Override
	public Company getCompanyById(Integer id) {
		// TODO Auto-generated method stub
		return mapper.getCompanyById(id);
	}

}

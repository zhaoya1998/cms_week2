package com.zhaoya.senior1.week2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zhaoya.senior1.week2.domain.Company;
import com.zhaoya.senior1.week2.domain.Vo;
import com.zhaoya.senior1.week2.service.CompanyService;
@Controller
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@RequestMapping("list")
	public String list(Model m,Vo vo,@RequestParam(defaultValue = "1")int pageNum) {
		PageInfo<Company> info=service.getCompanyList(vo,pageNum);
		m.addAttribute("vo", vo);
		m.addAttribute("info", info);
		return "list";
	}
	
	@RequestMapping("toUpdate")
	public String toUpdate(Model m,Integer id) {
		Company company=service.getCompanyById(id);
		m.addAttribute("company", company);
		return "update";
	}
	@ResponseBody
	@RequestMapping("update")
	public boolean update(Company company) {
		try {
			service.update(company);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
}

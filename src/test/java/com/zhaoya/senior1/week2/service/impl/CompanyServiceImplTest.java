package com.zhaoya.senior1.week2.service.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhaoya.common.untils.StreamUtil;
import com.zhaoya.common.untils.StringUtil;
import com.zhaoya.senior1.week2.domain.Company;
import com.zhaoya.senior1.week2.service.CompanyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class CompanyServiceImplTest {

	@Resource
	private CompanyService service;
	/*
	 * @Test public void testGetCompanyList() { fail("Not yet implemented"); }
	 */

	@Test
	public void testInsert() throws IOException {
		List<String> list = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
        ArrayList<Company> arrayList=new ArrayList<Company>();
		for (String str : list) {
			// System.out.println(str);
			Company company = new Company();
			String[] s = str.split("\\t");

			// id值要使用isNumber()工具方法判断是不是数字
			if (StringUtil.isNumber(s[0])) {
				company.setId(BigInteger.valueOf(Integer.valueOf((s[0]))));
			}
			// keywords 、description、公司名称、主营产品、地址要使用hasText()方法判断有没有值。
			if (StringUtil.hasText(s[1])) {
				company.setKeywords(s[1]);
			}
			if (StringUtil.hasText(s[2])) {
				company.setDescription(s[3]);
			}
			if (StringUtil.hasText(s[3])) {
				company.setName(s[3]);
			}
			if (StringUtil.hasText(s[4])) {
				company.setGoods(s[4]);
			}
			if (StringUtil.hasText(s[5])) {
				company.setAddr(s[5]);
			}
			//注册资本要使用hasText()方法判断有没有值，并使用isNumber()判断是不是数字
			if(StringUtil.hasText(s[6]) && StringUtil.isNumber(s[6])) {
				company.setPrice(s[6]);
			}
			// 成立时间要使用hasText()方法判断有没有值,判断是不是日类型
			if(StringUtil.hasText(s[7])) {
				company.setDate((s[7]));;
			}
			//年检日期为null，在前端必须显示为空，不能显示null
			company.setCheck(s[8]);
			company.setStatus(s[9]);
			company.setBeizhu(s[10]);
			
			arrayList.add(company);
		}
		service.insert(arrayList);
	}

}

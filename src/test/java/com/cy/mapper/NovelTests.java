package com.cy.mapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.vo.Category;

@SpringBootTest
public class NovelTests {
	@Autowired
	private Novel novel;
	@Test
	public void novelTests() {
		List<Category> list = novel.findAll();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd");
		for (Category cat : list) {
			Integer id = cat.getId();
			String name = cat.getName();
			Integer state = cat.getState();
			Date created = cat.getCreated();
			Date updated = cat.getUpdated();
			System.out.println("["+id+":"+name+":"+state+":"+sdf.format(created)+":"+sdf.format(updated)+"]");
		}
	}

}

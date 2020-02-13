package com.cy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pojo.Category;

@Mapper
public interface Novel {
	@Select("select * from tb_category")
	List<Category> findAll();
}

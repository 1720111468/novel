package com.cy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Category {
	private Integer id;
	private String name;
	private Integer state;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date created;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date updated;
}

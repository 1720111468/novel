package com.cy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chapter {
	private Integer id;
	private Integer novelId;
	private String title;
	private String content;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date created;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date updated;
}

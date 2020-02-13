package com.cy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Novel {
	private Integer id;
	private Integer catgoryId;
	private String title;
	private String author;
	private Integer state;
	private String summary;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date created;
	//@DateTimeFormat(pattern="yyyy/MM/dd")
	private Date updated;
	private String picture;
}




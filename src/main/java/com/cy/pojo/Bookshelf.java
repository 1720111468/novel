package com.cy.pojo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bookshelf {
	private Integer id;
	private Integer novelId;
	private Integer chapterId;
	private Date created;
	private Date updated;
}

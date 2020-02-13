package com.cy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Integer gender;
}

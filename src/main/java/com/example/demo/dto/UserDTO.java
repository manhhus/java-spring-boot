package com.example.demo.dto;

import java.util.Date;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	private Integer id;
	
	@NotNull
	@NotBlank
	private String username;

	@NotNull
	@NotBlank
	@Email
	private String email;

	@NotNull
	@NotBlank
	private String password;
	
	private String photo;
	
	@NotNull
	private Integer admin;

	@NotNull
	private Integer activated;
}
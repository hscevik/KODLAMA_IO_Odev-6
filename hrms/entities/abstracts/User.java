package com.hrms.hrms.entities.abstracts;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;




@Entity
@Table(name = "users")
@Data
public   class User implements Serializable{
	
 static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "email")
	private String eMail;
	@Column(name = "verify_code")
	private String verifyCode;
	@Column(name = "active")
	private Boolean active;

	
	
}

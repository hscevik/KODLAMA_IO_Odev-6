package com.hrms.hrms.entities.concretes;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.hrms.hrms.entities.abstracts.User;

import lombok.Data;

@Data
@Entity
@Table(name = "companies")
public class Company implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "web_adress")
	private String webAddress;
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id",insertable = true,updatable = false)
	private User user;
}

package com.Employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "addonservices")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer serviceno;
	private String servicename;
	private Double price;
	public Integer getServiceno() {
		return serviceno;
	}
	public void setServiceno(Integer serviceno) {
		this.serviceno = serviceno;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	
}

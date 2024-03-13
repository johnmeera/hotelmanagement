package com.Employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "view_reports")
public class Employeev {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;
	private String customername;
	private String roomtype;
	private Integer roomnumber;
	private String itemmenu;
	private Integer amounttobepaid;
	private String paymenttype;
	private String status;
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public Integer getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(Integer roomnumber) {
		this.roomnumber = roomnumber;
	}
	public String getItemmenu() {
		return itemmenu;
	}
	public void setItemmenu(String itemmenu) {
		this.itemmenu = itemmenu;
	}
	public Integer getAmounttobepaid() {
		return amounttobepaid;
	}
	public void setAmounttobepaid(Integer amounttobepaid) {
		this.amounttobepaid = amounttobepaid;
	}
	public String getPaymenttype() {
		return paymenttype;
	}
	public void setPaymenttype(String paymenttype) {
		this.paymenttype = paymenttype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

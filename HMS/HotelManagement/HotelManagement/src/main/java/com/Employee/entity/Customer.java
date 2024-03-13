package com.Employee.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="customer_status")
public class Customer {
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Date date;
private int booked;
private int available;
private int check_out;
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getBooked() {
	return booked;
}
public void setBooked(int booked) {
	this.booked = booked;
}
public int getAvailable() {
	return available;
}
public void setAvailable(int available) {
	this.available = available;
}
public int getCheck_out() {
	return check_out;
}
public void setCheck_out(int check_out) {
	this.check_out = check_out;
}
}

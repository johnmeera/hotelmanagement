package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cancellations")

public class cancellationsEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long sno;

private long customerid;
private String customername;
private long booking_refid;
private String booking_type;
private long amount;
private String status;
public long getSno() {
	return sno;
}
public void setSno(long sno) {
	this.sno = sno;
}
public long getCustomerid() {
	return customerid;
}
public void setCustomerid(long customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public long getBooking_refid() {
	return booking_refid;
}
public void setBooking_refid(long booking_refid) {
	this.booking_refid = booking_refid;
}
public String getBooking_type() {
	return booking_type;
}
public void setBooking_type(String booking_type) {
	this.booking_type = booking_type;
}
public long getAmount() {
	return amount;
}
public void setAmount(long amount) {
	this.amount = amount;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
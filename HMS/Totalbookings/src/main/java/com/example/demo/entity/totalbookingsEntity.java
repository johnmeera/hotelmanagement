package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="total_bookings")
public class totalbookingsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long s_no;
    
   
    private long customerid;
    private long booking_refid; 
    private String customername;
    private long mobileno;
    private String emailid;
    private Date date;
    private int adults;
    private int children;
    private long amount;
    private String status;
    private String aadons;
	public long getS_no() {
		return s_no;
	}
	public void setS_no(long s_no) {
		this.s_no = s_no;
	}
	public long getBooking_refid() {
		return booking_refid;
	}
	public void setBooking_refid(long booking_refid) {
		this.booking_refid = booking_refid;
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
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getAdults() {
		return adults;
	}
	public void setAdults(int adults) {
		this.adults = adults;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAadons() {
		return aadons;
	}
	public void setAadons(String aadons) {
		this.aadons = aadons;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
}

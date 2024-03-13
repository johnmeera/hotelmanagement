//package com.example.demo.booking.entity;
//
//public class bookingentity {
//
//}
package com.Employee.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Booking")
public class bookingentity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long customerid;
	private String roomtype;
	private LocalDate checkinDate;
    private LocalDate checkoutDate;
    private int adults;
    private int children;
    
    private boolean extrabeds;
   
    
	public long getCustomerid() {
		return customerid;
	}
	
	
	public String getRoom_type() {
		return roomtype;
	}
	
	
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	public LocalDate getCheckinDate() {
		return checkinDate;
	}
	public void setCheckinDate(LocalDate checkinDate) {
		this.checkinDate = checkinDate;
	}
	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(LocalDate checkoutDate) {
		this.checkoutDate = checkoutDate;
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
	
	public boolean isExtrabeds() {
		return extrabeds;
	}
	public void setExtrabeds(boolean extrabeds) {
		this.extrabeds = extrabeds;
	}
	
	
	
}

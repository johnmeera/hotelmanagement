package com.hms.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "Roomservice")
public class Roomservice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 5, unique = true)
    private Long orderId;

    private String type;
    private String roomtype;
    private String customername;
    private Long mobilenumber;
    private String orderplaced;
    private List<String> items;
    private List<Float> price;
    private List<Integer> quantity;
    private double servicecharge;
    private double total;
    private double gst;
    private double nettotal;
    private String bill;

    @CreatedDate
    private LocalDateTime time;

    @PrePersist
    public void prePersist() {
        this.orderId = generateOrderId();
        this.time = LocalDateTime.now();
    }

    private Long generateOrderId() {
        Random random = new Random();
        return (long) (random.nextInt(90000) + 10000);
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getOrderplaced() {
		return orderplaced;
	}

	public void setOrderplaced(String orderplaced) {
		this.orderplaced = orderplaced;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public List<Float> getPrice() {
		return price;
	}

	public void setPrice(List<Float> price) {
		this.price = price;
	}

	public List<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}

	public double getServicecharge() {
		return servicecharge;
	}

	public void setServicecharge(double servicecharge) {
		this.servicecharge = servicecharge;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getNettotal() {
		return nettotal;
	}

	public void setNettotal(double nettotal) {
		this.nettotal = nettotal;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

    // Constructors, getters, and setters
}

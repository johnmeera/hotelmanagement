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
@Table(name = "Dineinn")
public class Dineinn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 5, unique = true)
    private Long orderId;

    private String tablenumber;
    private String customername;
    private Long mobilenumber;
    @CreatedDate
    private LocalDateTime time;

    @PrePersist
    public void prePersist() {
        this.orderId = generateOrderId();
        this.time = LocalDateTime.now();
    }

    private Long generateOrderId() {
        Random random = new Random();
        return Long.valueOf(random.nextInt(90000) + 10000);
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getTablenumber() {
		return tablenumber;
	}

	public void setTablenumber(String tablenumber) {
		this.tablenumber = tablenumber;
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

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
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

	public List<Integer> getQuantity() {
		return quantity;
	}

	public void setQuantity(List<Integer> quantity) {
		this.quantity = quantity;
	}

	public List<Float> getPrice() {
		return price;
	}

	public void setPrice(List<Float> price) {
		this.price = price;
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

	private String orderplaced;
    private List<String> items;
    private List<Integer> quantity;
    private List<Float> price;
    private double total;
    private double gst;
    private double nettotal;
    private String bill;

    
}

package com.example.demo.Roomservice.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Roomservice")
public class RoomserviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String customername;
    private long mobilenumber;
    private String room;
    private String type;
    private String orderplaced;
    private String bill;

    
    private List<String> items;


    private List<Integer> quantity;

    
    private List<Float> price;

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
	public long getId() {
		return id;
	}
	private float servicecharge;
    private float total;
    private float gst;
    private float nettotal;
    
    
    
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOrderplaced() {
		return orderplaced;
	}
	public void setOrderplaced(String orderplaced) {
		this.orderplaced = orderplaced;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public float getServicecharge() {
		return servicecharge;
	}
	public void setServicecharge(float servicecharge) {
		this.servicecharge = servicecharge;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public float getGst() {
		return gst;
	}
	public void setGst(float gst) {
		this.gst = gst;
	}
	public float getNettotal() {
		return nettotal;
	}
	public void setNettotal(float nettotal) {
		this.nettotal = nettotal;
	}
	public void setId(long id2) {
		// TODO Auto-generated method stub
		
	}
	
    // Getters and setters
}

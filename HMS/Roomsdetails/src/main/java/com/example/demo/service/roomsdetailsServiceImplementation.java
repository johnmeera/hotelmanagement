package com.example.demo.service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "rooms_details")
public class RoomDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long sno; 

 
    private String roomType;
    private long price;
    private float gst;
    private float discount;
    private float netTotal;


    public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(float netTotal) {
        this.netTotal = netTotal;
    }
}

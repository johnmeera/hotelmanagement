package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rooms")
public class roomsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long rooms_id;

    private String room_type;
    private String room_features;
    private long ctc_price;
    private float gst;
    private float discount;
    private float net_total;
    private String addons;

    public long getRooms_id() {
        return rooms_id;
    }

    public void setRooms_id(long rooms_id) {
        this.rooms_id = rooms_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_features() {
        return room_features;
    }

    public void setRoom_features(String room_features) {
        this.room_features = room_features;
    }

    public long getCtc_price() {
        return ctc_price;
    }

    public void setCtc_price(long ctc_price) {
        this.ctc_price = ctc_price;
    }

    public float getGst() {
        return gst;
    }

    public void setGst(float gst) {
        this.gst = gst;
    }

    public float getNet_total() {
        return net_total;
    }

    public void setNet_total(float net_total) {
        this.net_total = net_total;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getAddons() {
        return addons;
    }

    public void setAddons(String addons) {
        this.addons = addons;
    }
}

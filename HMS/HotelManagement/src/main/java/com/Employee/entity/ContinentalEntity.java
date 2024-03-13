package com.Employee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Query;
import jakarta.persistence.Table;

@Entity
@Table(name="continental_food")
public class ContinentalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerid;
    private String breakfast;
    private long b_price;
    private String soups;
    private long s_price;
    private String starters;
    private long s1_price;
    private String maincourse;
    private long m_price;
    private String curries;
    private long c_price;
    private String desserts;
    private long d_price;
    private String drinks;
    private long d1_price;

    // Getters and Setters
    public Long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Long customerid) {
        this.customerid = customerid;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public long getB_price() {
        return b_price;
    }

    public void setB_price(long b_price) {
        this.b_price = b_price;
    }

    public String getSoups() {
        return soups;
    }

    public void setSoups(String soups) {
        this.soups = soups;
    }

    public long getS_price() {
        return s_price;
    }

    public void setS_price(long s_price) {
        this.s_price = s_price;
    }

    public String getStarters() {
        return starters;
    }

    public void setStarters(String starters) {
        this.starters = starters;
    }

    public long getS1_price() {
        return s1_price;
    }

    public void setS1_price(long s1_price) {
        this.s1_price = s1_price;
    }

    public String getMaincourse() {
        return maincourse;
    }

    public void setMaincourse(String maincourse) {
        this.maincourse = maincourse;
    }

    public long getM_price() {
        return m_price;
    }

    public void setM_price(long m_price) {
        this.m_price = m_price;
    }

    public String getCurries() {
        return curries;
    }

    public void setCurries(String curries) {
        this.curries = curries;
    }

    public long getC_price() {
        return c_price;
    }

    public void setC_price(long c_price) {
        this.c_price = c_price;
    }

    public String getDesserts() {
        return desserts;
    }

    public void setDesserts(String desserts) {
        this.desserts = desserts;
    }

    public long getD_price() {
        return d_price;
    }

    public void setD_price(long d_price) {
        this.d_price = d_price;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public long getD1_price() {
        return d1_price;
    }

    public void setD1_price(long d1_price) {
        this.d1_price = d1_price;
    }

    public static Query createQuery(String sql) {
        // TODO Auto-generated method stub
        return null;
    }
}

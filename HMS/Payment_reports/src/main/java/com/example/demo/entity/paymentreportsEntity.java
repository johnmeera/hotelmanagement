package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_reports")
public class paymentreportsEntity {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Customer_Id;
	
	private String Customer_Name;
	private long Amount;
	private long PaymentId;
	private String Payment_Type;
	
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public long getPaymentId() {
		return PaymentId;
	}
	public long getCustomer_Id() {
		return Customer_Id;
	}
	public void setCustomer_Id(long customer_Id) {
		Customer_Id = customer_Id;
	}
	public void setPaymentId(long paymentId) {
		PaymentId = paymentId;
	}
	public String getPayment_Type() {
		return Payment_Type;
	}
	public void setPayment_Type(String payment_Type) {
		Payment_Type = payment_Type;
	}




}

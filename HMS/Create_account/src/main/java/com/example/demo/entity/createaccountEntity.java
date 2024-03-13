package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="create_account")

public class createaccountEntity {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long account_id;

private String name;
private String designation;
private long phone;
private String email;
private String accountType;
private String permissions;
private String userId;
private String password;
private String confirmPassword;
private String changePassword;
public long getAccount_id() {
	return account_id;
}
public void setAccount_id(long account_id) {
	this.account_id = account_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public String getPermissions() {
	return permissions;
}
public void setPermissions(String permissions) {
	this.permissions = permissions;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public String getChangePassword() {
	return changePassword;
}
public void setChangePassword(String changePassword) {
	this.changePassword = changePassword;
}

}

package com.natabarit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="PAYMENT_TB")
public class Payment {
	
	@Id
	@GeneratedValue
private int paymentId;
private String paymentStatus;
private String transationId;
private int orderId;
private double amount;


public Payment() {
	super();

}
public Payment(int paymentId, String paymentStatus, String transationId, int orderId, double amount) {
	super();
	this.paymentId = paymentId;
	this.paymentStatus = paymentStatus;
	this.transationId = transationId;
	this.orderId = orderId;
	this.amount = amount;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public String getPaymentStatus() {
	return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
	this.paymentStatus = paymentStatus;
}
public String getTransationId() {
	return transationId;
}
public void setTransationId(String transationId) {
	this.transationId = transationId;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}

}



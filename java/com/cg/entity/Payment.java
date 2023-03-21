package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long paymentId;
	private String method;
	private long amountDue;
	public Payment() {
		super();	
	}
	public Payment(long paymentId, String method, long amountDue) {
		super();
		this.paymentId = paymentId;
		this.method = method;
		this.amountDue = amountDue;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public long getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(long amountDue) {
		this.amountDue = amountDue;
	}
	

}

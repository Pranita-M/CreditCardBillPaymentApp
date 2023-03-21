package com.cg.service;

import com.cg.entity.Payment;

public interface PaymentService {
	public Payment addPayment(Payment payment);
	public Payment removePayment(long id);
	public Payment updatePayment(long id, Payment payment);
	public Payment getPayment(long id);
}



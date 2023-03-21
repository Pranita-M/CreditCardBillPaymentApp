package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Payment;
import com.cg.exception.PaymentNotFoundException;
import com.cg.repository.PaymentRepository;

public class PaymentServiceImpl {
	
	@Service
	public class IPaymentServiceImpl implements PaymentService {

		@Autowired
		PaymentRepository paymentrepository;

		Payment pmt;

		@Override
		public Payment addPayment(Payment payment) {
			paymentrepository.save(payment);
			return payment;
		}

		@Override
		public Payment removePayment(long id) {
			if(paymentrepository.existsById(id)){
		    Payment payment=paymentrepository.findById(id).get();
			paymentrepository.deleteById(id);
			System.out.println("Payment removed successfully");
			return payment;
			}
			return null;
			
		}

		@Override
		public Payment updatePayment(long id, Payment payment) {
			return null;
			
		}

		@Override
		public Payment getPayment(long id) {
			return null;
			

	}
	}


}

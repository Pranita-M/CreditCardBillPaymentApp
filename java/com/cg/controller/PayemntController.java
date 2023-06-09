package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Payment;
import com.cg.service.PaymentService;

public class PayemntController {
	@RestController
	@RequestMapping("/ccbp-payment")
	public class PaymentController {

		@Autowired
	    PaymentService paymentservice;
		
		@PostMapping("/addpayment")
		public Payment addPayment(@Valid @RequestBody Payment payment) 
		{
			return paymentservice.addPayment(payment);
		}
		@DeleteMapping("/removepayment/{id}")
		public Payment removePayment(@PathVariable("id") long id) {
			return paymentservice.removePayment(id);
	    }
		
		@GetMapping("/getpayment/{id}")
		public Payment getPayment(@PathVariable("id") long id) {
			return paymentservice.getPayment(id);
		}
		
		@PutMapping("/updatepayment/{id}")
		public Payment updatePayment(@PathVariable("id")long id,@RequestBody Payment payment){
			return paymentservice.updatePayment(id,payment);
			}
		
	}


}

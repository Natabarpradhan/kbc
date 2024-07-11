package com.natabarit.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natabarit.entity.Payment;
import com.natabarit.repository.PaymentRepository;

@Service
public class PaymentSevice {
	@Autowired
private PaymentRepository paymentRepository;
	
	
	public Payment doPayment(Payment payment) {
		
		payment.setTransationId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		return paymentRepository.save(payment);
	}
	public String paymentProcessing() {
		//api should be call third party payment
		return new Random().nextBoolean()?"success":"false";
	}
}

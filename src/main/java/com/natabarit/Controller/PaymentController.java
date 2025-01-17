package com.natabarit.Controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natabarit.entity.Payment;
import com.natabarit.service.PaymentSevice;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	private PaymentSevice paymentService;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
	}
	



}

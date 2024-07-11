package com.natabarit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natabarit.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}

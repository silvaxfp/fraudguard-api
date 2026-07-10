package com.felipe.fraudguard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.fraudguard.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	
}

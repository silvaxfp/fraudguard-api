package com.felipe.fraudguard.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;	
import org.springframework.web.bind.annotation.RestController;

import com.felipe.fraudguard.entity.Transaction;
import com.felipe.fraudguard.service.TransactionService;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	private final TransactionService transactionService;
	
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
@PostMapping

public Transaction createTransaction(@RequestBody Transaction transaction) {
	return transactionService.saveTransaction(transaction);	
}
	
}
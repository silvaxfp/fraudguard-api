package com.felipe.fraudguard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;	
import org.springframework.web.bind.annotation.RestController;

import com.felipe.fraudguard.entity.Transaction;
import com.felipe.fraudguard.service.TransactionService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

	private final TransactionService transactionService;
	
	public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
@PostMapping
public Transaction createTransaction(@RequestBody @Valid Transaction transaction) {
	return transactionService.saveTransaction(transaction);	
}

	@GetMapping
	public List<Transaction> findAllTransactions() {
		return transactionService.findAllTransactions();
	}
	
	@GetMapping("/{id}")
	public Optional<Transaction> findTransactionById (@PathVariable Long id) {
		return transactionService.findTransactionById(id);
	}
}
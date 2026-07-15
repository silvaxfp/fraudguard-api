package com.felipe.fraudguard.service;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.felipe.fraudguard.entity.Transaction;
import com.felipe.fraudguard.repository.TransactionRepository;
@Service
public class TransactionService {

	private final TransactionRepository transactionRepository;
	
	public TransactionService(TransactionRepository transactionRepository) {
	    this.transactionRepository = transactionRepository;
	}
	 public Transaction saveTransaction(Transaction transaction) {
	        return transactionRepository.save(transaction);
	 }
	 public List<Transaction> findAllTransactions() {
		    return transactionRepository.findAll();
		}
	 public Optional<Transaction> findTransactionById(Long id) {
		 return transactionRepository.findById( id);
	 }
}


package com.felipe.fraudguard.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.felipe.fraudguard.dto.TransactionRequestDTO;
import com.felipe.fraudguard.dto.TransactionResponseDTO;
import com.felipe.fraudguard.entity.Transaction;
import com.felipe.fraudguard.entity.TransactionStatus;
import com.felipe.fraudguard.repository.TransactionRepository;

@Service
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public TransactionResponseDTO saveTransaction(TransactionRequestDTO request) {

        Transaction transaction = new Transaction();

        transaction.setUserId(request.getUserId());
        transaction.setAmount(request.getAmount());
        transaction.setLocation(request.getLocation());
        transaction.setDevice(request.getDevice());

        transaction.setStatus(TransactionStatus.PENDING);
        transaction.setCreatedAt(LocalDateTime.now());

        Transaction savedTransaction = transactionRepository.save(transaction);

        TransactionResponseDTO response = new TransactionResponseDTO();

        response.setId(savedTransaction.getId());
        response.setAmount(savedTransaction.getAmount());
        response.setLocation(savedTransaction.getLocation());
        response.setDevice(savedTransaction.getDevice());
        response.setStatus(savedTransaction.getStatus().name());
        response.setCreatedAt(savedTransaction.getCreatedAt());

        return response;
    }

    public List<Transaction> findAllTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> findTransactionById(Long id) {
        return transactionRepository.findById(id);
    }
}

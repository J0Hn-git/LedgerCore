package com.john.LedgerCore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.LedgerCore.model.Transaction;
import com.john.LedgerCore.repository.TransactionRepository;

@RestController    // this class handles HTTP requests and returns JSON.
@RequestMapping("/api/transactions")

public class TransactionController{
    @Autowired
    private TransactionRepository repository;

    @GetMapping      // Listen for GET requests to api/transactions
    public List<Transaction> getAllTransactions() {
        return repository.findAll(); // uses findAll instruction from the interface.
    }
    @PostMapping // Listen for POST requests to api/transactions
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return repository.save(transaction);
    }

}
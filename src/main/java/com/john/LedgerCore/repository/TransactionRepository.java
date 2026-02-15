package com.john.LedgerCore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.john.LedgerCore.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction , Long>{
    
}
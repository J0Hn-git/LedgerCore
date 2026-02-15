package com.john.LedgerCore.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Transaction{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String description;
    private Double amount;
    private String category;
    private LocalDateTime timestamp;


}

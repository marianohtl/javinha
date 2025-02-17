package com.poccrud.crud.services;

import com.poccrud.crud.entities.TransactionWps;
import com.poccrud.crud.dto.TransactionWpsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.poccrud.crud.repositories.TransactionRepository;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;

    @Transactional(readOnly = true)
    public TransactionWpsDTO findByOriginId(Long id) {
        TransactionWps transaction = repository.findByTransactionOriginId(id);
        return new TransactionWpsDTO(transaction);
    }
    @Transactional(readOnly = true)
    public TransactionWpsDTO findByDestinationId(Long id) {
        TransactionWps transaction = repository.findByTransactionDestinationId(id);
        return new TransactionWpsDTO(transaction);
    }
}

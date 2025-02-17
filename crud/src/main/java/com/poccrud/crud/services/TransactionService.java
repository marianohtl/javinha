package com.poccrud.crud.services;

import com.poccrud.crud.entities.TransactionWps;
import com.poccrud.crud.dto.TransactionWpsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.poccrud.crud.repositories.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository repository;

    @Transactional(readOnly = true)
    public List<TransactionWpsDTO> findByOriginId(Long id) {
        List<TransactionWps> transaction = repository.findByWpsOrigin_Id(id);
        return Mapper
                new List<TransactionWpsDTO>(transaction);
    }
    @Transactional(readOnly = true)
    public List<TransactionWpsDTO> findByDestinationId(Long id) {
        List<TransactionWps> transaction = repository.findByWpsDestination_Id(id);
        return new List<TransactionWpsDTO>(transaction);
    }
}

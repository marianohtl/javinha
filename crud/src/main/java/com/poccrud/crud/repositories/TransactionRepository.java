package com.poccrud.crud.repositories;

import com.poccrud.crud.entities.TransactionWps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransactionRepository extends JpaRepository<TransactionWps, Long> {
    public TransactionWps findByTransactionOriginId(Long idOrigin);

    public TransactionWps findByTransactionDestinationId(Long idDestination);
}

package com.poccrud.crud.repositories;

import com.poccrud.crud.entities.TransactionWps;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<TransactionWps, Long> {
    public List<TransactionWps> findByWpsOrigin_Id(Long idOrigin);

    public List<TransactionWps> findByWpsDestination_Id(Long idDestination);
}

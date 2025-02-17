package com.poccrud.crud.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_wps")
public class Wps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "wpsOrigin")
    private List<TransactionWps> transactionOrigin = new ArrayList<>();
    @OneToMany(mappedBy = "wpsDestination")
    private List<TransactionWps> transactionDestination = new ArrayList<>();

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TransactionWps> getTransactionOrigin() {
        return transactionOrigin;
    }

    public void setTransactionOrigin(List<TransactionWps> transactionOrigin) {
        this.transactionOrigin = transactionOrigin;
    }

    public List<TransactionWps> getTransactionDestination() {
        return transactionDestination;
    }

    public void setTransactionDestination(List<TransactionWps> transactionDestination) {
        this.transactionDestination = transactionDestination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



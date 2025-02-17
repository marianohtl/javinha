package com.poccrud.crud.dto;

import com.poccrud.crud.entities.TransactionWps;

public class TransactionWpsDTO {
    private Long id;
    private Long idOrigin;
    private Long idDestination;
    private String obs;
    private Boolean approved;

    public TransactionWpsDTO(Long id, Long idOrigin, Long idDestination, String obs, Boolean approved) {
        this.id = id;
        this.idOrigin = idOrigin;
        this.idDestination = idDestination;
        this.obs = obs;
        this.approved = approved;
    }
    public TransactionWpsDTO(TransactionWps transactionWps) {
        this.id = transactionWps.getId();
        this.idOrigin = transactionWps.getIdOrigin();
        this.idDestination = transactionWps.getIdDestination();
        this.obs = transactionWps.getObs();
        this.approved = transactionWps.getApproved();
    }
    public Long getId() {
        return id;
    }

    public Long getIdOrigin() {
        return idOrigin;
    }

    public Long getIdDestination() {
        return idDestination;
    }

    public String getObs() {
        return obs;
    }

    public Boolean getApproved() {
        return approved;
    }
}

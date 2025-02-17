    package com.poccrud.crud.entities;

    import jakarta.persistence.*;

    @Entity
    @Table(name = "tb_transaction_wps")
    public class TransactionWps {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "idOrigin")
        private Wps wpsOrigin;
        private Long transactionOriginId;

        @ManyToOne
        @JoinColumn(name = "idDestination")
        private Wps wpsDestination;

        private Long transactionDestinationId;

        private String obs;
        private Boolean approved;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Wps getWpsOrigin() {
            return wpsOrigin;
        }
        public Long getIdOrigin() {
            return transactionOriginId;
        }

        public void setWpsOrigin(Wps idOrigin) {
            this.wpsOrigin = idOrigin;
        }

        public Wps getWpsDestination() {
            return wpsDestination;
        }

        public Long getIdDestination() {
            return transactionDestinationId;
        }
        public void setWpsDestination(Wps wpsDestination) {
            this.wpsDestination = wpsDestination;
        }

        public String getObs() {
            return obs;
        }

        public void setObs(String obs) {
            this.obs = obs;
        }

        public Boolean getApproved() {
            return approved;
        }

        public void setApproved(Boolean approved) {
            this.approved = approved;
        }
    }



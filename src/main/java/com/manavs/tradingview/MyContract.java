package com.manavs.tradingview;

import javax.persistence.*;

@Entity
public class MyContract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contractId;

    @Column(unique = true)
    private String symbol;
    private String secType;
    private String exchange;
    private String primaryExch; // not required now
    private String currency;
    private String country;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getSecType() {
        return secType;
    }

    public void setSecType(String secType) {
        this.secType = secType;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getPrimaryExch() {
        return primaryExch;
    }

    public void setPrimaryExch(String primaryExch) {
        this.primaryExch = primaryExch;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

package com.manavs.tradingview;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ContractOptions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String contractId;
    private String time;
    private String recommendation; // SHORT, LONG
    private Date date;
    private double closePrice;
    private double sma20;
    private double lowestLow;
    private double smaCloseDiff;
    private double smaCloseDiffPer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getSma20() {
        return sma20;
    }

    public void setSma20(double sma20) {
        this.sma20 = sma20;
    }

    public double getLowestLow() {
        return lowestLow;
    }

    public void setLowestLow(double lowestLow) {
        this.lowestLow = lowestLow;
    }

    public double getSmaCloseDiff() {
        return smaCloseDiff;
    }

    public void setSmaCloseDiff(double smaCloseDiff) {
        this.smaCloseDiff = smaCloseDiff;
    }

    public double getSmaCloseDiffPer() {
        return smaCloseDiffPer;
    }

    public void setSmaCloseDiffPer(double smaCloseDiffPer) {
        this.smaCloseDiffPer = smaCloseDiffPer;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
}

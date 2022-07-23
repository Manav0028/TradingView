package com.manavs.tradingview;

import javax.persistence.*;

@Entity
public class CustomBar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer barId;

    private String symbol;
    private double emaThreeDays;
    private double emaFiveDays;
    private double smmaTwentyDays;
    private double smaTwentyDays;
    private double multiplier;
    private double atr;
    private double atrPercent;

    private String time;
    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;
    private int count;
    private double wap;

    public CustomBar(String time, double open, double high, double low, double close, long volume, double wap, int count) {
        this.time = time;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.wap = wap;
        this.count = count;
    }

    public CustomBar(String time, double open, double high, double low, double close, long volume, double wap, int count, String symbol) {
        this.time = time;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
        this.wap = wap;
        this.count = count;
        this.symbol = symbol;
    }

    public CustomBar() {

    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String name) {
        this.symbol = name;
    }

    public double getEmaThreeDays() {
        return emaThreeDays;
    }

    public void setEmaThreeDays(double emaThreeDays) {
        this.emaThreeDays = emaThreeDays;
    }

    public double getEmaFiveDays() {
        return emaFiveDays;
    }

    public void setEmaFiveDays(double emaFiveDays) {
        this.emaFiveDays = emaFiveDays;
    }

    public double getSmmaTwentyDays() {
        return smmaTwentyDays;
    }

    public void setSmmaTwentyDays(double smmaTwentyDays) {
        this.smmaTwentyDays = smmaTwentyDays;
    }

    public double getSmaTwentyDays() {
        return smaTwentyDays;
    }

    public void setSmaTwentyDays(double smaTwentyDays) {
        this.smaTwentyDays = smaTwentyDays;
    }

    public double getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public Integer getBarId() {
        return barId;
    }

    public void setBarId(Integer barId) {
        this.barId = barId;
    }

    public double getAtr() {
        return atr;
    }

    public void setAtr(double atr) {
        this.atr = atr;
    }

    public double getAtrPercent() {
        return atrPercent;
    }

    public void setAtrPercent(double atrPercent) {
        this.atrPercent = atrPercent;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getOpen() {
        return open;
    }

    public void setOpen(double open) {
        this.open = open;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public long getVolume() {
        return volume;
    }

    public void setVolume(long volume) {
        this.volume = volume;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getWap() {
        return wap;
    }

    public void setWap(double wap) {
        this.wap = wap;
    }

    @Override
    public String toString() {
        return "CustomBar{" +
                "barId=" + barId +
                ", name='" + symbol + '\'' +
                ", emaThreeDays=" + emaThreeDays +
                ", emaFiveDays=" + emaFiveDays +
                ", smmaTwentyDays=" + smmaTwentyDays +
                ", smaTwentyDays=" + smaTwentyDays +
                ", multiplier=" + multiplier +
                ", atr=" + atr +
                ", atrPercent=" + atrPercent +
                ", time='" + time + '\'' +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volume=" + volume +
                ", count=" + count +
                ", wap=" + wap +
                '}';
    }
}

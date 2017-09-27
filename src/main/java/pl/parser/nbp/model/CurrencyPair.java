package pl.parser.nbp.model;

import java.math.BigDecimal;

public class CurrencyPair {
    private BigDecimal bid;
    private BigDecimal ask;

    CurrencyPair(BigDecimal bid, BigDecimal ask) {
        this.bid = bid;
        this.ask = ask;
    }

    BigDecimal getBid() {
        return bid;
    }

    BigDecimal getAsk() {
        return ask;
    }

    void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    void setAsk(BigDecimal ask) {
        this.ask = ask;
    }

    @Override
    public String toString() {
        return "CurrencyPair{" +
                "bid=" + bid +
                ", ask=" + ask +
                '}';
    }
}
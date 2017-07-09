package pl.parser.nbp;

import java.math.BigDecimal;

public class CurrencyPair {
    private BigDecimal bid;
    private BigDecimal ask;

    public CurrencyPair(BigDecimal bid, BigDecimal ask) {
        this.bid = bid;
        this.ask = ask;
    }

    public BigDecimal getBid() {
        return bid;
    }

    public BigDecimal getAsk() {
        return ask;
    }

    public void setBid(BigDecimal bid) {
        this.bid = bid;
    }

    public void setAsk(BigDecimal ask) {
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
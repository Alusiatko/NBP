package pl.parser.nbp.model;

import java.math.BigDecimal;

public class NbpDaily {
    private CurrencyPair USD = new CurrencyPair(BigDecimal.valueOf(3.7068), BigDecimal.valueOf(3.7069));
    private CurrencyPair EUR = new CurrencyPair(BigDecimal.valueOf(4.2337), BigDecimal.valueOf(4.2338));
    private CurrencyPair CHF = new CurrencyPair(BigDecimal.valueOf(3.8525), BigDecimal.valueOf(3.8526));
    private CurrencyPair GBP = new CurrencyPair(BigDecimal.valueOf(4.7906), BigDecimal.valueOf(4.7907));

    public CurrencyPair getUSD() {
        return USD;
    }

    public CurrencyPair getEUR() {
        return EUR;
    }

    public CurrencyPair getCHF() {
        return CHF;
    }

    public CurrencyPair getGBP() {
        return GBP;
    }

    void setUSD(CurrencyPair USD) {
        this.USD = USD;
    }

    void setEUR(CurrencyPair EUR) {
        this.EUR = EUR;
    }

    void setCHF(CurrencyPair CHF) {
        this.CHF = CHF;
    }

    void setGBP(CurrencyPair GBP) {
        this.GBP = GBP;
    }
}
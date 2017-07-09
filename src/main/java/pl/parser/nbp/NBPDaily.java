package pl.parser.nbp;

import java.math.BigDecimal;

public class NBPDaily {
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

    public void setUSD(CurrencyPair USD) {
        this.USD = USD;
    }

    public void setEUR(CurrencyPair EUR) {
        this.EUR = EUR;
    }

    public void setCHF(CurrencyPair CHF) {
        this.CHF = CHF;
    }

    public void setGBP(CurrencyPair GBP) {
        this.GBP = GBP;
    }
}
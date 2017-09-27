package pl.parser.nbp.model;

public class NbpCurrencyData {
    private String currency;
    private Double currencyConverter;
    private String currencyCode;
    private Double bid;
    private Double ask;

    public NbpCurrencyData(String currency, Double currencyConverter, String currencyCode, Double bid, Double ask) {
        this.currency = currency;
        this.currencyConverter = currencyConverter;
        this.currencyCode = currencyCode;
        this.bid = bid;
        this.ask = ask;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getCurrencyConverter() {
        return currencyConverter;
    }

    public void setCurrencyConverter(Double currencyConverter) {
        this.currencyConverter = currencyConverter;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }
}

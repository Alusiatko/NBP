package pl.parser.nbp;

public class CurrencyHelper {

    //next step:
    //BigDecimal takeExchangeRate(Currency chosenCurrency, Date startingDate, Date endDate);
    public CurrencyPair takeExchangeRate(Currency chosenCurrency) {
        NBPDaily nbpDaily = new NBPDaily();
        CurrencyPair currencyPair = null;
        switch (chosenCurrency) {
            case USD:
                currencyPair = nbpDaily.getUSD();
                break;
            case EUR:
                currencyPair = nbpDaily.getEUR();
                break;
            case CHF:
                currencyPair = nbpDaily.getCHF();
                break;
            case GBP:
                currencyPair = nbpDaily.getGBP();
                break;
            default:
                System.out.println("Your exchange rate is unavailable");
        }
        System.out.println(currencyPair);
        return currencyPair;
    }
}
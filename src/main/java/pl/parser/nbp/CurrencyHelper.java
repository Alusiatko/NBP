package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.CurrencyPair;
import pl.parser.nbp.model.NbpDaily;

@Deprecated
class CurrencyHelper {

    CurrencyPair takeExchangeRate(Currency chosenCurrency) {
        NbpDaily nbpDaily = new NbpDaily();
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
                break;
        }
        System.out.println(currencyPair);
        return currencyPair;
    }
}
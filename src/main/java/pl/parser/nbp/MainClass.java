package pl.parser.nbp;

public class MainClass {

    public static void main(String[] args) {
        ClientAction clientAction = new ClientAction();
        CurrencyHelper currencyHelper = new CurrencyHelper();
        CurrencyPair currencyPair = currencyHelper.takeExchangeRate(clientAction.chooseCurrency());
        DateRange dateRange = clientAction.chooseDate();
    }
}
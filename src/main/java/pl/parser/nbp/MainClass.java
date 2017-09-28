package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.DateRange;
import pl.parser.nbp.model.NbpCurrencyData;

import java.util.List;

class MainClass {

    public static void main(String[] args) {
        ClientAction clientAction = new ClientAction();
        DateRange dateRange = clientAction.chooseDate();
        Currency chosenCurrency = clientAction.chooseCurrency();

        NbpApi nbpApi = new JsonNbpApi();
        List<NbpCurrencyData> data = nbpApi.fetchNBPCurrencyData(chosenCurrency, dateRange);

        CalculationHelper calculationHelper = new CalculationHelper();
        List<Double> doubleList = calculationHelper.convertToDouble(data);
        Double average = calculationHelper.countAverage(doubleList);
        System.out.println(average);

        Double standardDeviation = calculationHelper.countStandardDeviation(doubleList);
        System.out.println(standardDeviation);


    }
}
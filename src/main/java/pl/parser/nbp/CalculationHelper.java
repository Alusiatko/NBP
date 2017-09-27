package pl.parser.nbp;

import pl.parser.nbp.model.NbpCurrencyData;

import java.util.List;
import java.util.stream.Collectors;

class CalculationHelper {

    List<Double> convertToDouble(List<NbpCurrencyData> nbpCurrencyData) {
        return nbpCurrencyData.stream()
                .map(NbpCurrencyData::getBid)
                .collect(Collectors.toList());
    }

    Double countAverage(List<Double> prices) {
        return prices.stream()
                .mapToDouble(a -> a)
                .average()
                .orElse(0);
    }

    Double countStandardDeviation(List<Double> prices) {

        double standardDeviation = 0;

        for (Double price : prices) {
            double part = price - countAverage(prices);
            standardDeviation += (part * part);
        }
        int pricesListSize = prices.size();
        standardDeviation /= pricesListSize * (pricesListSize - 1);

        return Math.sqrt(standardDeviation);
    }
}
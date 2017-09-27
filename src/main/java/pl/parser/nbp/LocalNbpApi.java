package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.DateRange;
import pl.parser.nbp.model.NbpCurrencyData;

import java.util.Arrays;
import java.util.List;

class LocalNbpApi implements NbpApi {

    @Override
    public List<NbpCurrencyData> fetchNBPCurrencyData(Currency currency, DateRange dateRange) {
        NbpCurrencyData[] data = {
                new NbpCurrencyData(currency.name(), 5.6, "EUR", 4.4, 4.5),
                new NbpCurrencyData(currency.name(), 5.6, "EUR", 4.6, 4.9),
        };

        return Arrays.asList(data);
    }
}
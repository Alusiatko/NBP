package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.DateRange;
import pl.parser.nbp.model.NbpCurrencyData;

import java.util.List;

interface NbpApi {
    List<NbpCurrencyData> fetchNBPCurrencyData(Currency currency, DateRange dateRange);
}

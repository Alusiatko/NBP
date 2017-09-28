package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.DateRange;
import pl.parser.nbp.model.NbpCurrencyData;

import java.util.ArrayList;
import java.util.List;

/**
 http://api.nbp.pl/api/exchangerates/rates/{table}/{code}/{startDate}/{endDate}/
 {table} – typ tabeli (A, B, lub C)
 {code} – trzyliterowy kod waluty (standard ISO 4217)
 {topCount} – liczba określająca maksymalną liczność zwracanej serii danych
 {date}, {startDate}, {endDate} – data w formacie RRRR-MM-DD (standard ISO 8601)

 */
public class JsonNbpApi implements NbpApi {

    String API_ADDRESS =   "http://api.nbp.pl/api/exchangerates/rates/";
    String API_TABLE = "A";


    @Override
    public List<NbpCurrencyData> fetchNBPCurrencyData(Currency currency, DateRange dateRange) {

        String code = currency.name();
        String startDate = dateRange.getStartDate();
        String endDate = dateRange.getEndDate();

        String request = String.format("%s/%s/%s/%s/%s/?format=json", API_ADDRESS, API_TABLE, code, startDate, endDate);

        System.out.println(request);
        // TODO fetching

        return new ArrayList<>();
    }
}

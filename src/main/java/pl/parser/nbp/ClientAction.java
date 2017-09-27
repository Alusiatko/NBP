package pl.parser.nbp;

import pl.parser.nbp.model.Currency;
import pl.parser.nbp.model.DateRange;

import java.util.Scanner;


class ClientAction implements ClientTerminal {

    private Scanner scanner = new Scanner(System.in);

    public Currency chooseCurrency() {
        System.out.println("Enter currency: USD, EUR, CHF or GBP");
        String chosenCurrency = scanner.nextLine().trim();

        return Currency.valueOf(chosenCurrency);
    }

    DateRange chooseDate() {
        System.out.println("Enter starting date YYYY-MM-DD");
        String startDate = scanner.nextLine().trim();

        System.out.println("Enter end date YYYY-MM-DD");
        String endDate = scanner.nextLine().trim();

        return new DateRange(startDate, endDate);
    }
}
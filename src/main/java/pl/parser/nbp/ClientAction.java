package pl.parser.nbp;

import java.util.Scanner;


public class ClientAction implements ClientTerminal {

    private Scanner scanner = new Scanner(System.in);

    public Currency chooseCurrency() {
        System.out.println("Enter currency: USD, EUR, CHF or GBP");
        String chosenCurrency = scanner.nextLine().trim();

        return Currency.valueOf(chosenCurrency);
    }

    public DateRange chooseDate() {
        System.out.println("Enter starting date YYYY-MM-DD");
        String startDate = scanner.nextLine().trim();

        System.out.println("Enter end date YYYY-MM-DD");
        String endDate = scanner.nextLine().trim();

        return new DateRange(startDate, endDate);
    }
}
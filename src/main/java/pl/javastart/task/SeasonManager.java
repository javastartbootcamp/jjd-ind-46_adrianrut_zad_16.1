package pl.javastart.task;

import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę - do wczytywania danych użyj przekazany Scanner

    public void run(Scanner scanner) {
        Season[] seasons = printSeasons();
        printMonths(scanner, seasons);
    }

    private static void printMonths(Scanner scanner, Season[] seasons) {
        String input = scanner.nextLine();
        for (Season season : seasons) {
            if (season.getTranslation().equalsIgnoreCase(input)) {
                System.out.println("W tej porze roku są następujące miesiące: \n" + season.printMonths());
            }
        }
    }

    private static Season[] printSeasons() {
        System.out.println("Podaj porę roku:");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season.getTranslation());
        }
        return seasons;
    }

}

package eu.chrost;

import org.apache.commons.lang3.math.NumberUtils;

public class CarArgsValidator {
    public static void validateArgs(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Niepoprawna liczba argumentów");
        }
        if (!NumberUtils.isParsable(args[1])) {
            throw new IllegalArgumentException("Cena nie jest liczbą");
        }
        if ("Fiat".equals(args[0])) {
            throw new IllegalArgumentException("Marka niezgodna z polityką firmy");
        }
    }
}

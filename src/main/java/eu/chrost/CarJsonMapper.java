package eu.chrost;

public class CarJsonMapper {
    public static void main(String[] args) {

        try {
            validateArgs(args);
            //argumenty sa poprawne - tworzenie samochodu, json etc.
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawne dane: " + e.getMessage());
        }

    }

    private static void validateArgs(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException("Niepoprawna liczba argumentów");
        }
        //reszta ifozy
    }
}

package eu.chrost;

public class CarJsonMapper {
    public static void main(String[] args) {

        try {
            CarArgsValidator.validateArgs(args);
            //argumenty sa poprawne - tworzenie samochodu, json etc.
            Car car = new Car(args[0], Float.parseFloat(args[1]));
            System.out.println(car);
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawne dane: " + e.getMessage());
        }

    }

}

package eu.chrost;

import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) {
        doSomethingDangerous();
    }

    private static void doSomethingDangerous() {
        System.out.println("Otwieram plik");
        try {
            System.out.println("Przed operacją"); //komunikat
            Danger.doSomething();
            System.out.println("Po operacji");
        } catch (IOException e) {
            System.out.println("Wyjątek ! " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Wyjątek Zenka! " + e.getMessage());
        } finally {
            System.out.println("Zamykam plik");
        }
    }
}

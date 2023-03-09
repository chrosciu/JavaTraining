package eu.chrost;

import java.io.IOException;

public class Danger {
    public static void doSomething() throws IOException {
        throw new IOException("Coś nie pykło");
        //throw new IllegalStateException("Jak do tego doszło - nie wiem");
    }
}

package eu.chrost;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarArgsValidatorTest {

    @Test
    void shouldThrowExceptionIfArgCountIsLessThan2() {
        //given
        String[] args = new String[]{"A"};

        //when / then
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            CarArgsValidator.validateArgs(args);
        });
        assertEquals("Niepoprawna liczba argumentów", e.getMessage());

    }

    @Test
    void shouldNotThrowExceptionForCorrectArguments() {
        //given
        String[] args = new String[]{"A", "10.0"};

        //when / then
        assertDoesNotThrow(() -> {
            CarArgsValidator.validateArgs(args);
        });
    }


}
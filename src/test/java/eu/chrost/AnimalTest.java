package eu.chrost;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void shouldSetNameDuringCreation() {
        //given
        Animal animal = new Animal("Maja", 10);

        //when
        String name = animal.getName();

        //then
        assertEquals("Maja", name);
    }

    @Test
    void shouldSetAgeDuringCreation() {
        //given
        Animal animal = new Animal("Maja", 10);

        //when
        int age = animal.getAge();

        //then
        assertEquals(10, age);
    }

    @Test
    void shouldSetDifferentIdForEachAnimal() {
        //given
        Animal animal1 = new Animal("Maja", 10);
        Animal animal2 = new Animal("Sansa", 12);

        //when
        int id1 = animal1.getId();
        int id2 = animal2.getId();

        //then
        Assertions.assertFalse(id1 == id2);
    }

}
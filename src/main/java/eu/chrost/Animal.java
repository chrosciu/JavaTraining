package eu.chrost;
//Komentarz Krystiana
import java.util.Objects;

public class Animal {

    private static int nextId = 7;

    private int id;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        //this.surname = surname;
        this.age = age;
        this.id = nextId;
        nextId += 1;
    }
    public static int getNextId() {
        return nextId;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

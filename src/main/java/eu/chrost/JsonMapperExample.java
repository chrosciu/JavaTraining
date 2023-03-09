package eu.chrost;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMapperExample {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Maja", 10);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(animal);
        System.out.println(s);
    }
}

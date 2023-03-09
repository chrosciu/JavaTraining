package eu.chrost;

public class AnimalExample {
    public static void main(String[] args) {

        int nextId = Animal.getNextId();
        System.out.println(nextId);

        Animal maja = new Animal("Maja", 10);
        Animal sansa = new Animal("Sansa", 12);

        System.out.println(maja);
        System.out.println(sansa);

        nextId = Animal.getNextId();
        //nextId = maja.getNextId();
        System.out.println(nextId);

        System.out.println(maja.equals(sansa));

        Animal majaClone = new Animal("Maja", 10);
        System.out.println(maja.equals(majaClone));

        int majaHash = maja.hashCode();
        int majaCloneHash = majaClone.hashCode();
        int sansaHash = sansa.hashCode();

        System.out.println(majaHash);
        System.out.println(majaCloneHash);
        System.out.println(sansaHash);
    }
}

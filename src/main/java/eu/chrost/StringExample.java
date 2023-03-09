package eu.chrost;

public class StringExample {
    public static void main(String[] args) {
        String s1 = new String("Marcin");
        String s2 = "Marcin";
        String s3 = "Marcin";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}

package eu.chrost;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayTask {
    public static void main(String[] args) {
        int[] tab = createArray(18);
        System.out.println("tab");
        display(tab);

        int[] tab2 = removeAtIndex(tab, 15);
        System.out.println("tab2");
        display(tab2);
    }

    private static void display(int[] tab) {
        for (int i : tab) {
            System.out.println(i);
        }
    }

    private static int[] createArray(int n) {
        //stworzyc tablice liczb od 1 do n i ja zwrocic
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i + 1;
        }
        return tab;
    }

    private static double calculateAvg(int[] tab) {
        //wyliczyc srednia z elementow tablicy
        return 0.0;
    }

    private static int[] append(int[] tab, int newElem) {
        //dolozyc newElem na koniec tablicy
        return tab;
    }

    private static int[] removeAtIndex(int[] tab, int index) {
        return ArrayUtils.remove(tab, index);
    }
}

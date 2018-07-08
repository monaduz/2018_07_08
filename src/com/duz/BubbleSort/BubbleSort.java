package com.duz.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] tablica = new int[] {1,6,5,8,3,4,9,12,15,84,626};
        System.out.println("Bubble Sort: ");
        bubbleSort(tablica);
        for (int i: tablica) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] tablica) {
        int temporary;
        int counter;
        do {
            counter=0;
        for (int i = 0; i < tablica.length-1 ; i++) {
            if (tablica[i] > tablica[i + 1]) {
                temporary = tablica[i];
                tablica[i] = tablica[i + 1];
                tablica[i + 1] = temporary;
                counter++;
            }
        }
        } while (counter!=0);


    }
}

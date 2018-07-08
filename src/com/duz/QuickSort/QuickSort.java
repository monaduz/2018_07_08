package com.duz.QuickSort;

public class QuickSort {

    public static int[] tablica = new int[]{5, 444, 53, 0, 2, 2, 69, 3, 6, 4, 8, 9, 1, 10};

    public static void main(String[] args) {
        System.out.println("Quick Sort: ");
        quickSort( 0, tablica.length-1 );

        for (int i : tablica) {
            System.out.println( i );
        }
    }

    static void quickSort(int left, int right) {
        if (right <= left)
            return;
        else {
            int pivot = partition( left, right );
            quickSort( left, pivot - 1 );
            quickSort( pivot + 1, right );
        }
    }

    static int partition(int left, int right) {
        int x = tablica[left];
        int pivot = left;

        for (int i = left + 1; i <= right; i++)
            if (tablica[i] <= x) {
                pivot = pivot + 1;
                swap( pivot, i );
            }
        swap( pivot, left );
        return pivot;
    }

    static void swap(int i, int j) {
        int temporary = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temporary;
    }
}
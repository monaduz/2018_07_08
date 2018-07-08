package com.duz.searchBinary;

public class BinarySearch {
    public static int[] array = new int[]{1, 2, 3, 5, 9, 12, 25, 36, 45, 85, 90};
    public static int s = 45;

    public static void main(String[] args) {

        System.out.println( binarySearch( array, s ) + 1 );
    }

    private static int binarySearch(int[] array, int s) {
        return findS( 0, array.length - 1 );
    }

    private static int findS(int left, int right) {
        int pivot = (left + right) / 2;

        if (s == array[pivot]) {
            return pivot;
        } else if (s < array[pivot]) {
            return findS( left, pivot - 1 );
        } else if (s > array[pivot]) {
            return findS( pivot + 1, right );
        }
        return -1;
    }
}
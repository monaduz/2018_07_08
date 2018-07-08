package com.duz.searchLinear;

import java.util.Arrays;

public class LinearSearch {

    static int linearSearch(int[] array, int s) {
        int searchValue = Arrays.stream( array )
                .filter( elem -> elem == s )
                .findFirst()
                .orElseThrow( RuntimeException::new );

        int searchIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == s) {
                searchIndex = i;
            }
        }
        return searchIndex;
    }

    public static void main(String[] args) {
        int[] array = new int []{2,6,6,2,5,24,256};
        int s=24;
        System.out.println( linearSearch( array, s )+1 );
    }
}

package com.duz.HeapSort;

public class HeapSort {


    public static void main(String[] args) {
        int[] tablica = new int[]{5, 444, 53, 0, 2, 2, 69, 3, 6, 4, 8, 9, 1, 10};

        System.out.println("Heap Sort: ");
        heapSort(tablica);

        for (int i : tablica) {
            System.out.println( i );
        }
    }

    private static void heapSort(int[] tablica) {
        buildMaxHeap( tablica, tablica.length );
        for (int i = tablica.length - 1; i > 0; i--) {
            swap( tablica,0,i );
            maxHeapify( tablica, 1, i );
        }
    }

    private static void buildMaxHeap(int[] tablica, int heapSize) {
        if (tablica == null) {
            throw new NullPointerException();
        }
        if (tablica.length <= 0 || heapSize <= 0) {
            throw new IllegalArgumentException();
        }
        for (int i = heapSize / 2; i > 0; i--) {
            maxHeapify( tablica, i, heapSize );
        }
    }

    private static void maxHeapify(int[] tablica, int index, int heapSize) {
        int child = index * 2;
        int anotherChild = child + 1;
        int largest=index;

        if (child <= heapSize && tablica[child - 1] > tablica[index - 1]) {
            largest = child;
        }

        if (anotherChild <= heapSize && tablica[anotherChild - 1] > tablica[largest - 1]) {
            largest = anotherChild;
        }

        if (largest != index) {
            swap(tablica,index-1,largest-1);
            maxHeapify( tablica, largest, heapSize );
        }
    }

    static void swap(int[] tablica, int i, int j) {
        int temporary = tablica[i];
        tablica[i] = tablica[j];
        tablica[j] = temporary;
    }
}
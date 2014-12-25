package edu.algorithms.sort;

/**
 * @author Artem Pronchakov (artem.pronchakov@gmail.com)
 */
public class InsertionSort extends AbstractSort {
    @Override
    public void sort(Comparable[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (InsertionSort.less(array[j], array[j - 1])) {
                    InsertionSort.exch(array, j, j - 1);
                }
            }
        }
    }
}

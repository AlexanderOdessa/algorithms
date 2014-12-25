package edu.algorithms.sort;

/**
 * @author Artem Pronchakov (artem.pronchakov@gmail.com)
 */
public class SelectionSort extends AbstractSort {

    @Override
    public void sort(Comparable[] array) {
        for (int ordered_index = 0; ordered_index < array.length; ordered_index++) {
            int current_minimum = ordered_index;
            for (int i = ordered_index; i < array.length; i++) {
                if (SelectionSort.less(array[i], array[current_minimum])) {
                    current_minimum = i;
                }
            }
            SelectionSort.exch(array, ordered_index, current_minimum);
        }
    }

}

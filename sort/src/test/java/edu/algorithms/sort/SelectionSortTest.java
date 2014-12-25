package edu.algorithms.sort;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Artem Pronchakov (artem.pronchakov@gmail.com)
 */
public class SelectionSortTest {
    @Test
    public void testSelectionSort() throws Exception {
        String[] strings = new String[]{"one", "two", "three", "four", "five", "six"};

        assertFalse(SelectionSort.isSorted(strings));
        new SelectionSort().sort(strings);
        assertTrue(SelectionSort.isSorted(strings));
    }
}

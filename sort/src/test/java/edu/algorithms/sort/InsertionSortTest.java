package edu.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Artem Pronchakov (artem.pronchakov@gmail.com)
 */
public class InsertionSortTest {

    @Test
    public void testSelectionSort() throws Exception {
        String[] strings = new String[]{"one", "two", "three", "four", "five", "six"};

        assertFalse(SelectionSort.isSorted(strings));
        new InsertionSort().sort(strings);
        System.out.println(Arrays.asList(strings));
        assertTrue(SelectionSort.isSorted(strings));
    }

}

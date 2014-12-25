package edu.algorithms.sort;

/**
 * @author Artem Pronchakov (artem.pronchakov@gmail.com)
 */
public abstract class AbstractSort {

    protected static boolean less(Comparable c1, Comparable c2) {
        return (c1.compareTo(c2) < 0);
    }

    protected static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static boolean isSorted(Comparable[] a) {
        for (int i = 0 + 1; i <= a.length - 1; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }

    public abstract void sort(Comparable[] array);

}

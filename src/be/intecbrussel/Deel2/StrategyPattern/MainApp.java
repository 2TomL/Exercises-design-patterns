package be.intecbrussel.Deel2.StrategyPattern;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 1,5, 4,8,7};
        //gebruik BubbleSort
        ArraySorter bubbleSorter = new ArraySorter(new BubbleSortAlgorithm());
        int[] sortedArray = bubbleSorter.sortArray(array);
        System.out.println("Bubble Sort: " + Arrays.toString(sortedArray));

        //gebruik MergeSort
        ArraySorter mergeSorter = new ArraySorter(new MergeSortAlgorithm());
        sortedArray = mergeSorter.sortArray(array);
        System.out.println("Merge Sort: " + Arrays.toString(sortedArray));
    }
}
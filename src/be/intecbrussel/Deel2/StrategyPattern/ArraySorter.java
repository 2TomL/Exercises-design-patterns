package be.intecbrussel.Deel2.StrategyPattern;

public class ArraySorter {
    private ArraySortingAlgorithm sortingAlgorithm;
// vette shit, omdat m niet saved ff dit erbij
    public ArraySorter(ArraySortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }
    public int[] sortArray(int[] array) {
        return sortingAlgorithm.sortArray(array);
    }
}

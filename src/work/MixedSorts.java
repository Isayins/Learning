package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class MixedSorts {
    // Threshold for switching to a simpler sort algorithm
    private static final int THRESHOLD = 95;  // You might want to experiment with this value
    private static final int ID_NUMS = 500000;
    private static final Random rand = new Random();

    private static int partition(ArrayList<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr.get(j) <= pivot) {
                i++;
                Collections.swap(arr, i, j);
            }
        }
        Collections.swap(arr, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> weeklyItems = generateSortedItems(ID_NUMS);
        for (int i = 0; i < weeklyItems.size(); i++) {
            System.out.println("Day " + (i + 1) + weeklyItems.get(i).subList(0, 999));
        }

        long start = System.currentTimeMillis();
        // Using hybrid sort on each list
        for (int i = 0; i < weeklyItems.size(); i++) {
            hybridQuicksort(weeklyItems.get(i), 0, weeklyItems.get(i).size() - 1);
            System.out.println("Sorted Day " + (i + 1) + ": " + weeklyItems.get(i).subList(0, 999));
        }
        long end = System.currentTimeMillis();
        System.out.println("MixedSort Duration: " + (end - start) + " ms");
    }

    public static void hybridQuicksort(ArrayList<Integer> arr, int low, int high) {
        while (low < high) {
            if (high - low + 1 <= THRESHOLD) {
                insertionSort(arr, low, high);
                break; // Exit the while loop after sorting small sub-array
            } else {
                int pivotIndex = randomizedPartition(arr, low, high);
                int leftSize = pivotIndex - low;
                int rightSize = high - pivotIndex;

                // Recurse on the smaller sub-array to reduce the maximum recursion depth
                if (leftSize <= rightSize) {
                    hybridQuicksort(arr, low, pivotIndex - 1);
                    low = pivotIndex + 1; // Tail call optimization on the right sub-array
                } else {
                    hybridQuicksort(arr, pivotIndex + 1, high);
                    high = pivotIndex - 1; // Tail call optimization on the left sub-array
                }
            }
        }
    }
    public static void hybridQuicksort2(ArrayList<Integer> arr, int low, int high) {
        while (low < high) {
            if (high - low + 1 <= THRESHOLD) {
                selectionSort(arr, low, high);
                break; // Exit the while loop after sorting small sub-array
            } else {
                int pivotIndex = randomizedPartition(arr, low, high);
                int leftSize = pivotIndex - low;
                int rightSize = high - pivotIndex;

                // Recurse on the smaller sub-array to reduce the maximum recursion depth
                if (leftSize <= rightSize) {
                    hybridQuicksort2(arr, low, pivotIndex - 1);
                    low = pivotIndex + 1; // Tail call optimization on the right sub-array
                } else {
                    hybridQuicksort2(arr, pivotIndex + 1, high);
                    high = pivotIndex - 1; // Tail call optimization on the left sub-array
                }
            }
        }
    }

    private static int randomizedPartition(ArrayList<Integer> arr, int low, int high) {
        int pivotIndex = low + rand.nextInt(high - low + 1);
        Collections.swap(arr, pivotIndex, high); // Move pivot to end for partitioning
        return partition(arr, low, high);
    }

    private static void insertionSort(ArrayList<Integer> arr, int low, int high) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while (j >= low && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);
        }
    }

    private static void selectionSort(ArrayList<Integer> arr, int low, int high) {
        for (int i = low; i <= high; i++) {
            int minIndex = i;
            for (int j = i + 1; j <= high; j++) {
                if (arr.get(j) < arr.get(minIndex)) {
                    minIndex = j;
                }
            }
            Collections.swap(arr, i, minIndex);
        }
    }

    private static ArrayList<ArrayList<Integer>> generateSortedItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>(Arrays.asList(1000, 5000, 10000, 50000, 75000, 100000, 500000));
        for (int numItems : dayList) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 0; i < numItems; i++) {
                items.add(rand.nextInt(ran) + 1);  // Generate random integers from 1 to ran (500000)
            }
//            Collections.sort(items);
            itemsLists.add(items);

        }
        return itemsLists;
    }
}

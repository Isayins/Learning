package work;

import java.util.ArrayList;
import java.util.Collections;

public class MixedSorts {
        // Thresholds for hybrid sorting
        private static final int THRESHOLD = 95;
        private static final int ID_NUMS = 1000;

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> weeklyItems = new ArrayList<>();
        weeklyItems = generateSortedItems(ID_NUMS);
        for (int i = 0; i < weeklyItems.size(); i++) {
            System.out.println("day" + (i + 1) + weeklyItems.get(i).subList(0, 999));
        }

        long start = System.currentTimeMillis();
        // Sorting each ArrayList using Quicksort
        int temp = 1;
        for (ArrayList<Integer> items : weeklyItems) {
            MixedSort2(items,0,items.size()-1);
            System.out.println("Sorted day" + temp + items.subList(0, 999)); // Printing sorted items for each day
            temp++;
        }
        long end = System.currentTimeMillis();
        System.out.println("MixedSort" + (end - start) + "s");
    }

        public static void MixedSort1(ArrayList<Integer> arr, int low, int high) {
            if (high - low + 1 <= THRESHOLD) {
                selectionSort(arr, low, high);
            } else {
                int pivot = partition(arr, low, high);
                MixedSort1(arr, low, pivot - 1);
                MixedSort1(arr, pivot + 1, high);
            }
        }
        public static void MixedSort2(ArrayList<Integer> arr, int low, int high) {
            if (high - low + 1 <= THRESHOLD) {
                insertionSort(arr);
            } else {
                int pivot = partition(arr, low, high);
                MixedSort2(arr, low, pivot - 1);
                MixedSort2(arr, pivot + 1, high);
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
        public static void insertionSort(ArrayList<Integer> arr) {
            for (int i = 1; i < arr.size(); i++) {
                int key = arr.get(i);
                int j = i - 1;

                // Scans forward through the sorted section, moving elements larger than key backwards
                while (j >= 0 && arr.get(j) > key) {
                    arr.set(j + 1, arr.get(j));
                    j--;
                }
                arr.set(j + 1, key);
            }
        }

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
    // Method to generate Sorted item IDs
    private static ArrayList<ArrayList<Integer>> generateSortedItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        Collections.addAll(dayList, 1000, 5000, 10000, 50000, 75000, 100000, 500000);

        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            int numberOfIterations = dayList.get(j) / ran;
            if (numberOfIterations == 0) {
                for (int l = 1; l <= dayList.get(j); l++)
                    items.add(l); // Random integer IDs, If ran is greater than the value in dayList, set to 1.
            }
            for (int i = 0; i < numberOfIterations; i++) {
                for (int l = 1; l <= ran; l++)
                    items.add(l); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }
}

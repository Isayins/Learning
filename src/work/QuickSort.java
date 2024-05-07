package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class QuickSort {
    private static final int ID_NUMS = 10000;

    // Quicksort algorithm
    public static void quicksort(ArrayList<Integer> items, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(items, low, high);
            quicksort(items, low, pivotIndex - 1);
            quicksort(items, pivotIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> items, int low, int high) {
        int pivot = items.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (items.get(j) < pivot) {
                i++;
                Collections.swap(items, i, j);
            }
        }
        Collections.swap(items, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> weeklyItems = new ArrayList<>();
        weeklyItems = generateRandomItems(ID_NUMS);
        for (int i = 0; i < weeklyItems.size(); i++) {
            System.out.println("day" + (i + 1) + weeklyItems.get(i).subList(0, 999));
        }

        long start = System.currentTimeMillis();
        // Sorting each ArrayList using Quicksort
        int temp = 1;
        for (ArrayList<Integer> items : weeklyItems) {
            quicksort(items, 0, items.size() - 1);
            System.out.println("Sorted day" + temp + items.subList(0, 999)); // Printing sorted items for each day
            temp++;
        }
        long end = System.currentTimeMillis();
        System.out.println("quickSortTime" + (end - start) + "s");
    }

    // Method to generate random item IDs
    private static ArrayList<ArrayList<Integer>> generateRandomItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        Collections.addAll(dayList, 1000, 5000, 10000, 50000, 75000, 100000, 500000);
        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 1; i < dayList.get(j); i++) {
                items.add((int) (Math.random() * ran + 1)); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }
}

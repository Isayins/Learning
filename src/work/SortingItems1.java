package work;

import java.util.ArrayList;
import java.util.Collections;

public class SortingItems1 {

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
        // Create ArrayLists for each day of the week
        ArrayList<ArrayList<Integer>> weeklyItems = new ArrayList<>();
        weeklyItems.add(generateItems(1000));
        weeklyItems.add(generateItems(5000));
        weeklyItems.add(generateItems(10000));
        weeklyItems.add(generateItems(50000));
        weeklyItems.add(generateItems(75000));
        weeklyItems.add(generateItems(100000));
        weeklyItems.add(generateItems(500000));
        long start = System.currentTimeMillis();
        // Sorting each ArrayList using Quicksort
        for (ArrayList<Integer> items : weeklyItems) {
            quicksort(items, 0, items.size() - 1);
            System.out.println(items); // Printing sorted items for each day
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    // Method to generate random item IDs
    private static ArrayList<Integer> generateItems(int count) {
        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            items.add((int) (Math.random() * 1000)); // Random integer IDs
        }
        return items;
    }

    // Method to generate random item IDs
    private static ArrayList<ArrayList<Integer>> generateSortedItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        dayList.add(1000);
        dayList.add(5000);
        dayList.add(10000);
        dayList.add(50000);
        dayList.add(75000);
        dayList.add(100000);
        dayList.add(500000);

        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 0; i < dayList.get(j); i++) {
                items.add((int) (Math.random() * ran)); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }
}

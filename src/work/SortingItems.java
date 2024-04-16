package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortingItems {

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

    private static void mixedQuicksort(ArrayList<Integer> items, int low, int high,int temp){
//        if (items.size()> temp)
//            quicksort(low);

    }

    public static void BubbleSort(ArrayList<Integer> items, int low, int high){
        for (int i = low ;i<high;i++){
            for (int j = i;j<high;j++){
                if (items.get(j)>items.get(j+1))
                    Collections.swap(items,i,j);
            }
        }
    }

    public static void main(String[] args) {
        // Create ArrayLists for each day of the week
        ArrayList<ArrayList<Integer>> weeklyItems = new ArrayList<>();
        HashMap<Integer, Integer> timeStore = new HashMap<>();
        for (int a = 1000; a < 1001; a++) {
            // random items
//            weeklyItems = generateItems(a);
            // sortedItems
//            weeklyItems = generateSortedItems(a);
            // generate reversed item IDs
//            weeklyItems = generateReversedItems(a);
            long start = System.currentTimeMillis();
            // Sorting each ArrayList using Quicksort
            for (ArrayList<Integer> items : weeklyItems) {
                quicksort(items, 0, items.size() - 1);
                System.out.println(items); // Printing sorted items for each day
            }
            long end = System.currentTimeMillis();
            Integer time = Integer.valueOf(String.valueOf(end - start));
            System.out.println(end - start);
            timeStore.put(a,time);
        }
    }
// 1231

    // Method to generate random item IDs
    private static ArrayList<ArrayList<Integer>> generateItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        dayList.add(1000);
        dayList.add(5000);
        dayList.add(10000);
        dayList.add(50000);
        dayList.add(75000);
        dayList.add(100000);
        dayList.add(500000);
        ran++;
        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 1; i < dayList.get(j); i++) {
                items.add((int) (Math.random() * ran)); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }

    // Method to generate Sorted item IDs
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
            for (int i = 0; i < dayList.get(j)/ran; i++) {
                for (int l = 1;l<= ran;l++)
                    items.add(l); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }

    // Method to generate reversed item IDs
    private static ArrayList<ArrayList<Integer>> generateReversedItems(int ran) {
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
            for (int i = 0; i < dayList.get(j)/ran; i++) {
                for (int l = ran;l>=1 ;l--)
                    items.add(l); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }

}

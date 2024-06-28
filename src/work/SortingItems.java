package work;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortingItems {

    public static void writeListToCSV(ArrayList<Integer> list, String filePath,String note) {
        try (BufferedWriter bfr = new BufferedWriter(new FileWriter(filePath,true))) {
            bfr.write(note +'[');
            for (int item : list) {
                bfr.write(String.valueOf(item)+',');
            }
            bfr.write(']');
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

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


    public void BubbleSort(ArrayList<Integer> items, int low, int high) {
        for (int i = low; i < high; i++) {
            for (int j = i; j < high; j++) {
                if (items.get(j) > items.get(j + 1))
                    Collections.swap(items, i, j);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        // Create ArrayLists for each day of the week
        ArrayList<ArrayList<Integer>> weeklyItems = new ArrayList<>();
        HashMap<Integer, Integer> timeStore = new HashMap<>();

        for (int a = 100000; a < 100001; a++) {
            // random items
            weeklyItems = generateRandomItems(a);
            // sortedItems
//            weeklyItems = generateSortedItems(a);
            // generate reversed item IDs
//            weeklyItems = generateReversedItems(a);
            String filepath = "data.csv";
            for (int i = 0; i < weeklyItems.size(); i++) {
                writeListToCSV(weeklyItems.get(i),filepath,"day" + (i + 1));
                System.out.println("day" + (i + 1) + weeklyItems.get(i).subList(0,999));
            }

            long start = System.currentTimeMillis();
            // Sorting each ArrayList using Quicksort
            int temp = 1;
            for (ArrayList<Integer> items : weeklyItems) {
                // quicksort
//                quicksort(items, 0, items.size() - 1);
//                new mixedQuicksort().mixedSort(items);
//                new MixedSorts().MixedSort1(items,0,items.size() - 1);
                writeListToCSV(items,filepath,"Sorted day" + temp);
                System.out.println("Sorted day" + temp + items.subList(0,999)); // Printing sorted items for each day
//                PrintStream out = System.out;
//                System.out.println(out);
                temp++;
            }
            long end = System.currentTimeMillis();
            Integer time = Integer.valueOf(String.valueOf(end - start));
            System.out.println("quickSortTime" + (end - start) + "s");
            timeStore.put(a, time);
        }
    }
// 1231

    // Method to generate random item IDs
    private static ArrayList<ArrayList<Integer>> generateRandomItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        Collections.addAll(dayList, 1000, 5000, 10000, 50000, 75000, 100000, 500000);
        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 1; i < dayList.get(j); i++) {
                items.add((int) (Math.random() * ran+1)); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
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

    // Method to generate reversed item IDs
    private static ArrayList<ArrayList<Integer>> generateReversedItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>();
        Collections.addAll(dayList, 1000, 5000, 10000, 50000, 75000, 100000, 500000);


        for (int j = 0; j < dayList.size(); j++) {
            ArrayList<Integer> items = new ArrayList<>();
            int numberOfIterations = dayList.get(j) / ran;
            if (numberOfIterations == 0) {
                for (int l = dayList.get(j); l >= 1; l--)
                    items.add(l); // Random integer IDs, If ran is greater than the value in dayList, set to 1.
            }
            for (int i = 0; i < numberOfIterations; i++) {
                for (int l = ran; l >= 1; l--)
                    items.add(l); // Random integer IDs
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }

}



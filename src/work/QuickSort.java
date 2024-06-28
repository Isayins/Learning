package work;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class QuickSort {
    private static final int ID_NUMS = 500000;

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


    // Write list to CSV file
    private static void writeListToCSV(ArrayList<Integer> list, BufferedWriter writer, String note) throws IOException {
        writer.write(note +'[');
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i).toString());
            if (i < list.size() - 1) {
                writer.write(", ");
            }
        }
        writer.write(']');
        writer.newLine();
    }

    public static void main(String[] args) {
        String unsortedFilePath = "unsorted_data.csv";
        String sortedFilePath = "sorted_data.csv";
        ArrayList<ArrayList<Integer>> weeklyItems = generateRandomItems(ID_NUMS);

        try (BufferedWriter unsortedWriter = new BufferedWriter(new FileWriter(unsortedFilePath));
             BufferedWriter sortedWriter = new BufferedWriter(new FileWriter(sortedFilePath))) {

            int day = 1;
            for (ArrayList<Integer> items : weeklyItems) {
                // Write unsorted list to CSV
                writeListToCSV(items, unsortedWriter, "Day " + day + " unsorted: ");
                // Terminal output for unsorted items
                System.out.println("Day " + day + " - Unsorted (first 1000 items): ");
                System.out.println(items.subList(0, Math.min(1000, items.size())));


                // Sort the list
                quicksort(items, 0, items.size() - 1);

                // Terminal output for sorted items
                System.out.println("Day " + day + " - Sorted (first 1000 items): ");
                System.out.println(items.subList(0, Math.min(1000, items.size())));

                // Write sorted list to CSV
                writeListToCSV(items, sortedWriter, "Day " + day + " sorted: ");

                // Reverse the sorted list
                Collections.reverse(items);

                // Terminal output for reverse sorted items
                System.out.println("Day " + day + " - Reverse Sorted (first 1000 items): ");
                System.out.println(items.subList(0, Math.min(1000, items.size())));

                // Write reverse sorted list to CSV
                writeListToCSV(items, sortedWriter, "Day " + day + " reverse sorted: ");

                day++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }


    // Method to generate random item IDs
    private static ArrayList<ArrayList<Integer>> generateRandomItems(int ran) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        ArrayList<Integer> dayList = new ArrayList<>(Arrays.asList(1000, 5000, 10000, 50000, 75000, 100000, 500000));
        Random rand = new Random();

        for (int numItems : dayList) {
            ArrayList<Integer> items = new ArrayList<>();
            for (int i = 0; i < numItems; i++) {
                items.add(rand.nextInt(ran) + 1); // Generate random integers from 1 to maxId
            }
            itemsLists.add(items);
        }
        return itemsLists;
    }
}
package work;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class EfficiencyTest {
        private static final int ID_NUMS = 500000;
        private static final int REPEATS = 5;


    // Quicksort algorithm
    public static void quicksort(ArrayList<Integer> items, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(items, low, high);
            quicksort(items, low, pivotIndex - 1);
            low = pivotIndex + 1;  // �Ż��ݹ�Ϊ����
        }
    }

    private static int partition(ArrayList<Integer> items, int low, int high) {
        // ������ֵ��ѡ������
        int mid = low + (high - low) / 2;
        if (items.get(mid) < items.get(low)) {
            Collections.swap(items, mid, low);
        }
        if (items.get(high) < items.get(low)) {
            Collections.swap(items, high, low);
        }
        if (items.get(high) < items.get(mid)) {
            Collections.swap(items, high, mid);
        }
        int pivot = items.get(mid);
        Collections.swap(items, mid, high);  // �������Ƶ�ĩβ

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
        ArrayList<ArrayList<Integer>> weeklyItems = readItemsFromCSV("unsorted_data.csv");

        for (int day = 1; day <= weeklyItems.size(); day++) {
            ArrayList<Integer> items = weeklyItems.get(day - 1);
            System.out.println("Testing Day " + day);
            testSortingEfficiency(new ArrayList<>(items));  // Random list
            Collections.sort(items);
            testSortingEfficiency(new ArrayList<>(items));  // Sorted list
            Collections.reverse(items);
            testSortingEfficiency(new ArrayList<>(items));  // Reverse sorted list
        }
    }

    private static void testSortingEfficiency(ArrayList<Integer> items) {
        long totalTime = 0;
        for (int i = 0; i < REPEATS; i++) {
            ArrayList<Integer> tempItems = new ArrayList<>(items);
            long start = System.currentTimeMillis();
            quicksort(tempItems, 0, tempItems.size() - 1);
            long end = System.currentTimeMillis();
            totalTime += (end - start);
        }
        System.out.println("Average sort time: " + (totalTime / REPEATS) + "ms");
    }

    private static ArrayList<ArrayList<Integer>> readItemsFromCSV(String filepath) {
        ArrayList<ArrayList<Integer>> itemsLists = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = br.readLine()) != null) {// 11
                ArrayList<Integer> items = new ArrayList<>();
                // ���������а���������ǰ׺���������� ':' �ָ�
                String[] parts = line.split(":");
                if (parts.length > 1) {
                    String[] values = parts[1].trim().split(",");  // ֻ����ð�ź�Ĳ���
                    for (String value : values) {
                        try {
                            items.add(Integer.parseInt(value.trim()));
                        } catch (NumberFormatException e) {
                            System.err.println("Skipping invalid number format: " + value);
                        }
                    }
                    itemsLists.add(items);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            e.printStackTrace();
        }
        return itemsLists;
    }
}
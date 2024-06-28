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

    private static  int partition(ArrayList<Integer> items, int low, int high) {
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





    public  void BubbleSort(ArrayList<Integer> items, int low, int high){
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
    private  ArrayList<ArrayList<Integer>> generateReversedItems(int ran) {
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
class mixedQuicksort {
    public  ArrayList<Integer> mixedSort(ArrayList<Integer> arr){
        int max=arr.size()-1;
        quickSort1(arr,0,max);
        return arr;
    }
    /**
     * ��������
     * @param arr     ��������
     * @param minIndex    ��ʼ�±�
     * @param maxIndex    �����±�
     */
    public   void quickSort1(ArrayList<Integer> arr,int minIndex,int maxIndex){
        //�����һ��Ϊkey;
        int key=arr.get(maxIndex);
        int i=minIndex;
        int j=maxIndex;
        do{
            while(arr.get(j)>=key&&j>i){
                j--;
            }
            while(arr.get(i)<=key&&j>i){
                i++;
            }
            //λ���滻
            Collections.swap(arr,i,j);
        }while(i!=j);
        //��iΪ�ֽ�㡣
        // todo
        arr.set(minIndex,arr.get(j));
        arr.set(i,key);


        //���δ���򲿷ֵĵ���������8�����ÿ������򣬷������ð�ݡ�
        if(i-minIndex>8){
            quickSort1(arr,minIndex,i-1);
        }else{
            bubbleSort(arr,minIndex,i-1);
        }
        if(maxIndex-i>8){
            quickSort1(arr,i+1,maxIndex);
        }else{
            bubbleSort(arr,i+1,maxIndex);
        }
    }

    /**
     * ð������
     * @param arr     ��������
     * @param minIndex    ��ʼ�±�
     * @param maxIndex    �����±�
     */
    public  void bubbleSort(ArrayList<Integer> arr ,int minIndex,int maxIndex){

        //System.out.println("ð��min="+minIndex+",max="+maxIndex);
        //System.out.println(Arrays.toString(arr));
        boolean flag=true;//Ԫ���Ƿ񽻻����
        int temp=0;
        int t=0;
        for(int i=minIndex;i<maxIndex;i++){
            flag=true;
            for(int j=minIndex;j<maxIndex-t;j++){
                //System.out.println(arr[j]+":"+arr[j+1]);
                if(arr.get(j)>arr.get(j+1)){
                    //System.out.println("--------------");
                   Collections.swap(arr,j,j+1);
                    flag=false;
                }
            }
            if(flag){
                break;
            }
            t++;
        }
        //System.out.println(Arrays.toString(arr));
    }}

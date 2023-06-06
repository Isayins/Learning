package sort;

import java.util.Arrays;

public class DualPivortSort {


    public static void main(String[] args) {
        int a[] = {7, 3, 5, 4, 8, 5, 6, 55, 4, 333, 44, 7, 885, 23, 6, 44};
        dualPivotQuickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void dualPivotQuickSort(int[] arr, int start, int end) {
        if (start > end) return;//��������ֱ�ӷ���
        if (arr[start] > arr[end])
            swap(arr, start, end);
        int pivot1 = arr[start], pivot2 = arr[end];//�������������Ҳ��ֵ
        //(start��left]:���С�ڵ���pivot1 [right,end)����pivot2
        int left = start, right = end, k = left + 1;
        while (k < right) {
            //����ཻ��
            if (arr[k] < pivot1) {
                //��Ҫ����
                swap(arr, ++left, k++);
            } else if (arr[k] <= pivot2) {//���м�����
                k++;
            } else {
                while (arr[right] > pivot2) {//���ȫ��С��ֱ���������ѭ��

                    if (right-- == k)
                        break;
                }
                if (k >= right) break;
                swap(arr, k, right);
            }
        }
        swap(arr, start, left);
        swap(arr, end, right);
        dualPivotQuickSort(arr, start, left - 1);
        dualPivotQuickSort(arr, left + 1, right - 1);
        dualPivotQuickSort(arr, right + 1, end);
    }

    static void swap(int arr[], int i, int j) {
        int team = arr[i];
        arr[i] = arr[j];
        arr[j] = team;
    }
}


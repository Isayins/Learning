package sort;

public class QuickSort {
    private static void quicksort(int [] a,int left,int right)
    {
        int low=left;
        int high=right;
        //���������˳��һ�����ܻ죬������������Խ�磡����very important������
        if(low>high)//��Ϊ�ж��Ƿ��ֹ����
            return;
        int k=a[low];//����ռ�k��ȡ������һ����Ϊ���������Ҫ����඼����С���Ҳ඼������
        while(low<high)//��һ��Ҫ������С��a[low],�Ҳ����a[low]��
        {
            while(low<high&&a[high]>=k)//�Ҳ��ҵ���һ��С��k��ֹͣ
            {
                high--;
            }
            //�������ҵ���һ������С����
            a[low]=a[high];//�ŵ�lowλ��
            while(low<high&&a[low]<=k)//��low�����ҵ���һ������k�ģ��ŵ��Ҳ�a[high]λ��
            {
                low++;
            }
            a[high]=a[low];
        }
        a[low]=k;//��ֵȻ�����ҵݹ������֮
        quicksort(a, left, low-1);
        quicksort(a, low+1, right);
    }
}






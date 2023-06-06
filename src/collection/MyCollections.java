package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class MyCollections {
    public static void main(String[] args) {
        // ����HashMap�����Ǳ�ţ�ֵ������
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        // ����ArrayList���洢���
        ArrayList<Integer> array = new ArrayList<Integer>();
        // ������ɫ����͵�������
        String[] colors = { "��", "?", "?", "?" };
        String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
        // ��0��ʼ��HashMap����洢��Ų��洢��Ӧ�����棬ͬʱ��ArrayList����洢���
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "С��");
        array.add(index);
        index++;
        hm.put(index, "����");
        array.add(index);
        // ϴ��(ϴ���Ǳ��)

        Collections.shuffle(array);
        // ����(�����Ǳ��)
        TreeSet<Integer> playerSet1 = new TreeSet<Integer>();
        TreeSet<Integer> playerSet2 = new TreeSet<Integer>();
        TreeSet<Integer> playerSet3 = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();
        for (int i = 0; i < array.size(); i++) {
            int x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                playerSet1.add(x);
            } else if (i % 3 == 1) {
                playerSet2.add(x);
            } else if (i % 3 == 2) {
                playerSet3.add(x);
            }
        }
        // ���ÿ��Ʒ���
        lookPoker("player1", playerSet1, hm);
        lookPoker("player2", playerSet2, hm);
        lookPoker("player3", playerSet3, hm);
        lookPoker("dp", dpSet, hm);
    }

    /**
     * ���Ʒ���
     * @param name �������
     * @param ts   ������
     * @param hm   ���漯��
     */
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + ": ");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}

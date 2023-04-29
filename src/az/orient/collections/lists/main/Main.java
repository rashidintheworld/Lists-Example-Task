package az.orient.collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        Random random = new Random();

        System.out.print("1. list uzunluğunu girin: ");
        int length1 = scanner.nextInt();

        System.out.print("2. list uzunluğunu girin: ");
        int length2 = scanner.nextInt();

        // Her iki listenin de aynı uzunlukta olmasını sağla
        int maxLength = Math.max(length1, length2);
        length1 = maxLength;
        length2 = maxLength;

        // Her adımda rastgele sayılar ekle
        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                list1.add(random.nextInt(10));
            }else{
                list1.add(0);
            }
            if (i < length2) {
                list2.add(random.nextInt(10));
            }else{
                list2.add(0);
            }
        }

        System.out.println("Liste 1: " + list1);
        System.out.println("Liste 2: " + list2);
    }
}

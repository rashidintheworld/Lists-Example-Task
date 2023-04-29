package az.orient.collections.lists.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1Methods {
    public List<Integer>[] addLists(List<Integer> list1, List<Integer> list2, int lenFirstList, int lenSecondList, int startNum, int endNum) {
        Random random = new Random();
        for (int i = 0; i < lenFirstList; i++) {
            list1.add(random.nextInt(startNum, endNum));
        }
        for (int i = 0; i < lenSecondList; i++) {
            list2.add(random.nextInt(startNum, endNum));
        }
        return new List[]{list1, list2};
    }
    public List<Integer>[] matchLists(List<Integer> list1, List<Integer> list2) {
        int length1 = list1.size();
        int length2 = list2.size();
        while (list1.size() != length2) {
            if (length1 < length2) {
                list1.add(0);
                length1++;
            } else {
                list2.add(0);
                length2++;
            }
        }
        return new List[]{list1, list2};
    }

    public List<Integer> sumLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            resultList.add(list1.get(i) + list2.get(i));
        }
        return resultList;
    }
    public List<Integer> diffLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            resultList.add(list1.get(i) - list2.get(i));
        }
        return resultList;
    }
    public void writeListToFile(List<Integer> list, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("List : " + list.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void writeListToFile(List<Integer> list1, List<Integer> list2, String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("List 1: " + list1.toString() + "\n");
            writer.write("List 2: " + list2.toString() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
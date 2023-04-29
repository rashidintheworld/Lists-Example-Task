package az.orient.collections.lists.model;

import java.util.ArrayList;
import java.util.List;

public class Task2Methods {
    public List<Integer> myRetainAll(List<Integer> list1,List<Integer> list2){
        List<Integer> sameElements = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            Integer num1 = list1.get(i);
            for (int j = 0; j < list2.size(); j++) {
                Integer num2 = list2.get(j);
                if (num1.equals(num2) && !sameElements.contains(num1)) {
                    sameElements.add(num1);
                }
            }
        }
        return sameElements;
    }
}

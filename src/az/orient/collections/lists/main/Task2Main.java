package az.orient.collections.lists.main;

import az.orient.collections.lists.model.Task1Methods;
import az.orient.collections.lists.model.Task2Methods;

import java.util.*;

public class Task2Main extends Task1Methods {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first list count : ");
            int firstListLenght = sc.nextInt();
            System.out.println("Enter second list count : ");
            int secondListLenght = sc.nextInt();
            if (firstListLenght < 0 && secondListLenght < 0) {
                firstListLenght = Math.abs(firstListLenght);
                secondListLenght = Math.abs(secondListLenght);
            }
            System.out.println("Enter start of random numbers : ");
            int startNum = sc.nextInt();
            System.out.println("Enter end number of random numbers : ");
            int endNum = sc.nextInt();
            if (startNum == endNum) {
                throw new IllegalArgumentException("The intervals cannot be identical!");
            } else if (startNum > endNum) {
                startNum = startNum + endNum;
                endNum = startNum - endNum;
                startNum = startNum - endNum;
            }
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            Task2Methods task2Methods = new Task2Methods();
            Task2Main task2Main = new Task2Main();

            task2Main.addLists(list1, list2, firstListLenght, secondListLenght, startNum, endNum);

            List<Integer>[] originalList = task2Main.matchLists(list1, list2);
            List<Integer> retainedList = task2Methods.myRetainAll(list1, list2);

            int minNumOfRetainedList = Collections.max(retainedList);
            int maxNumOfRetainedList = Collections.min(retainedList);

            System.out.println("Original List -> " + Arrays.toString(originalList));
            System.out.println("Retained list -> " + retainedList);
            System.out.println("Min - "+minNumOfRetainedList);
            System.out.println("Max - "+maxNumOfRetainedList);
            System.out.println("Min index - "+retainedList.indexOf(minNumOfRetainedList));
            System.out.println("Max index - "+retainedList.indexOf(maxNumOfRetainedList));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }































/*
            System.out.println("First list : " + firstIntegerList);
            System.out.println("Second list : " + secondIntegerList);
            List<Integer> sameElements = new ArrayList<>();
            for (int i = 0; i < firstIntegerList.size(); i++) {
                Integer num1 = firstIntegerList.get(i);
                for (int j = 0; j < secondIntegerList.size(); j++) {
                    Integer num2 = secondIntegerList.get(j);
                    if (num1.equals(num2) && !sameElements.contains(num1)) {
                        sameElements.add(num1);
                    }
                }
            }
            System.out.println("Same Elements : " + sameElements);
                if (firstIntegerList.isEmpty()) {
                    throw new IllegalArgumentException("List is empty");
                }
                int min = sameElements.get(0);
                int max = sameElements.get(0);
                for (int i = 1; i < sameElements.size(); i++) {
                    int num = sameElements.get(i);
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            System.out.println("Min : " + min);
            System.out.println("Max : " + max);
            System.out.println("Max index : " + sameElements.indexOf(max));
            System.out.println("Min index : " + sameElements.indexOf(min));
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println("An occured unexpected exception!");
            ex.printStackTrace();
        } finally {
            sc.close();
        }*/
    }
}









    /*
    List<Integer> minIndices = new ArrayList<>();
    List<Integer> maxIndices = new ArrayList<>();

for (int i = 0; i < sameElements.size(); i++) {
    int num = sameElements.get(i);
    if (num < min) {
        minIndices.clear();
        minIndices.add(i);
        min = num;
    } else if (num == min) {
        minIndices.add(i);
    }
    if (num > max) {
        maxIndices.clear();
        maxIndices.add(i);
        max = num;
    } else if (num == max) {
        maxIndices.add(i);
    }
     */
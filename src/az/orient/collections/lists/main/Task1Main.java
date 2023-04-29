package az.orient.collections.lists.main;

import az.orient.collections.lists.model.Task1Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1Main {
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

            Task1Methods methods1 = new Task1Methods();
            List<Integer>[] addedLists = methods1.addLists(list1, list2, firstListLenght, secondListLenght, startNum, endNum);
            List<Integer>[] matchedLists = methods1.matchLists(list1, list2);
            List<Integer> sumList = methods1.sumLists(list1, list2);
            List<Integer> diffList = methods1.diffLists(list1, list2);
            String originalFileName = "originalLists.txt";
            methods1.writeListToFile(list1, list2, originalFileName);
            String sumFileName = "sumlist.txt";
            methods1.writeListToFile(sumList, sumFileName);
            String diffFileName = "diffList.txt";
            methods1.writeListToFile(diffList, diffFileName);
            System.out.println("Congrats, succesfuly added!");
        } catch (IllegalArgumentException ex) {
            ex.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

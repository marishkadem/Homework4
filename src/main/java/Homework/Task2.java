/* Пусть дан LinkedList с несколькими элементами.
        * Реализуйте метод, который вернет “перевернутый” список.
        */
package Homework;

import java.util.Collections;
import java.util.LinkedList;


public class Task2 {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        Collections.addAll(names, "Vera", "Nadejda", "Lubov");

        System.out.println(getInvertedList(names));
    }

    private static LinkedList<String> getInvertedList(LinkedList<String> names) {
        LinkedList<String> res = new LinkedList<>();
        while (!names.isEmpty()) {
            res.add(names.pollLast());
        }
        return res;
    }
}

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая — последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.


package Homework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> deque = new LinkedList<>();

        while (true) {
            System.out.println("enter text: ");
            String input = scanner.nextLine(); //ввод данных пользователя

            if (input.equals("quit")) { // завершение программы
                break;
            }
            else if (input.equals("print")) {
                System.out.println(deque);
            }
            else if (input.equals("revert")) {
                System.out.println(deque.pollFirst());
            }
            else {
                deque.addFirst(input);
            }
            System.out.println(deque);
        }

        scanner.close();
    }
}

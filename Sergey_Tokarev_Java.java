package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Sergey_Tokarev_Java {
    public static void main(String[] args) {

        System.out.println("Введите целое число:");
        sevenOrNot(new Scanner(System.in).nextInt());


        System.out.println("Введите имя:");
        vyacheslavOrNot(new Scanner(System.in).next());


        System.out.println("Введите целые числа через пробел:");
        systemOutThree(Arrays.stream(new Scanner(System.in)
                .nextLine().split(" ")).mapToInt(Integer::parseInt).toArray());
    }

    static void sevenOrNot(int n) {
        if (n > 7) System.out.println("Привет");
    }

    static void vyacheslavOrNot(String name) {
        System.out.println(name.equals("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени");
    }

    static void systemOutThree(int[] array) {
        System.out.print("Числа, кратные 3: ");
        for (int item : array) {
            if (item % 3 == 0) {
                System.out.printf("%d ", item);
            }
        }
    }
}
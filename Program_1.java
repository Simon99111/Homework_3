//Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "cp866");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.printf("Введите количество чисел: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            {
                list.add(i, new Random().nextInt(10));
            }
        System.out.println("Cписок случайных чисел = " + list);
        list.removeIf((item -> (item % 2) == 0));
        System.out.println("Без чётных чисел : " + list);
        System.out.println("Минимальное = " + Collections.min(list));
        System.out.println("Максимальное = " + Collections.max(list));
        System.out.println("Среднее арифметическое = " + average(list));
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += list.get(i);
        return sum / list.size();
    }
}
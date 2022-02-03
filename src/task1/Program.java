package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        Integer a = Integer.valueOf(reader.readLine());

        System.out.println("Введите число");
        Integer b = Integer.valueOf(reader.readLine());


        if (a > b) {
            System.out.println("Число " + a + " больше " + b );
        } else if (a < b) {
            System.out.println("Число " + a + " меньше " + b );
        } else
            System.out.println("Числа равны");

        System.out.println("Сумма введенных чисел - " + sum(a, b));

    }

    static int sum(Integer a, Integer b) {
        return a + b;
    }
}


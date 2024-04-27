/*
*   Написать функцию/метод, которая возвращает массив простых чисел в диапазоне (2 числа - минимальное и максимальное) заданных чисел.
Например, на вход переданы 2 числа: от 11 до 20  (диапазон считается включая граничные значения).
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] Prime(int a,int b){
        List<Integer> prime = new ArrayList<Integer>();

        for (int i = a; i <= b; i++ ){
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) prime.add(i) ;
        }

        return prime.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [] prime = Prime (a,b);
        System.out.println(Arrays.toString(prime));
    }
}
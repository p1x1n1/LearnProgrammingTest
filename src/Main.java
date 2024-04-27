/*
*  Разработайте функцию, которая принимает целое число в качестве аргумента и возвращает строку, содержащую это число и слово "компьютер"
*  в нужном склонении по падежам в зависимости от числа. Например, при вводе числа 25 функция
*  должна возвращать "25 компьютеров", для числа 41 — "41 компьютер",
* а для числа 1048 — "1048 компьютеров".
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] NOD(int[] mass){
        Arrays.sort(mass);//Так ищем делителей всех чисел то НОД не превышает минимального числа в массиве
        int min = mass[0];
        List<Integer> nod = new ArrayList<Integer>();
        for (int i = 2; i <= min; i++ ){
            boolean isNod = true;
            for(int m: mass){
                if (m % i != 0){
                    isNod = false;
                    break;
                }
            }
            if (isNod) nod.add(i) ;
        }

        return nod.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();//ввод элементов через пробел: 1 2 3 4
        int[] numbers = Arrays.stream(n.split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nod = NOD(numbers);
        System.out.println(Arrays.toString(nod));
    }
}
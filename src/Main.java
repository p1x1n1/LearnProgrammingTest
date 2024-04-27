/*
*  Разработайте функцию, которая принимает целое число в качестве аргумента и возвращает строку, содержащую это число и слово "компьютер"
*  в нужном склонении по падежам в зависимости от числа. Например, при вводе числа 25 функция
*  должна возвращать "25 компьютеров", для числа 41 — "41 компьютер",
* а для числа 1048 — "1048 компьютеров".
*
* */

import java.util.Scanner;

public class Main {
    public static void OutCntComputer(int n){
        switch(n%10){
            case 1:
                System.out.println(n+" компьютер");
                break;
            case 2,3,4:
                System.out.println(n+" компьютера");
                break;
            default:
                System.out.println(n+" компьютеров");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        OutCntComputer(n);

    }
}

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void tableMultiplication(int a){
        int b = (int) sqrt(a);
        int s = String.valueOf(a).length();
        System.out.printf("%"+(s+s+1)+"d",1);
        for (int i=2;i<=b;i++) {
            System.out.printf("%"+(s+1)+"d", i);
        }
        System.out.println();
        for (int i = 1; i <= b; i++ ){
            System.out.printf("%"+s+"d", i);
            for(int j = 1; j <= b; j++){
                System.out.printf("%"+(s+1)+"d", i * j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //можно сделать используя матрицы
        tableMultiplication(a);
    }
}

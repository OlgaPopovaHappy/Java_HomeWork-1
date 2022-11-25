//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// n!(произведение чисел от 1 до n)

import java.util.Scanner;

public class HW_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        if (n > 0) {System.out.println("Сумма треугольного числа = " + (n * (n + 1)) / 2);}
        else {System.out.println("Это как же из ничего построить треугольник? Надо подумать...");}

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;}

        System.out.printf("%d! = %d", n, result);
    }
}

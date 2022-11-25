//Реализовать простой калькулятор

import java.util.Scanner;

public class HW_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double firstNum = sc.nextDouble();

        System.out.print("Введите знак \"+\", \"-\", \"*\" или \"/\": ");
        char sym = sc.next().charAt(0);

        System.out.print("Введите второе число: ");
        double secondNum = sc.nextDouble();

        if (sym == '+'){
            System.out.printf("%.1f + %.1f = %s", firstNum, secondNum, firstNum + secondNum);
        } else if (sym == '-'){
            System.out.printf("%.1f - %.1f = %s", firstNum, secondNum, firstNum - secondNum);
        }else if (sym == '*'){
            System.out.printf("%.1f * %.1f = %s", firstNum, secondNum, firstNum * secondNum);
        }else if (sym == '/'){
            if (secondNum != 0) {
                double d = firstNum / secondNum;
                System.out.printf("%.1f : %.1f = %.1f", firstNum, secondNum, d);
            } else {
                System.out.println("На \"0\" делить нельзя!");
            }
        }
    }
}

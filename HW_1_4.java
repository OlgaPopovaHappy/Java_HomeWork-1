/*+Задано уравнение вида q + w = e, q, w, e >= 0.
Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Требуется восстановить выражение до верного равенства.
Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;

public class HW_1_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое слагаемое: ");
        StringBuilder q = new StringBuilder(sc.next());
        System.out.print("Введите второе слагаемое: ");
        StringBuilder w = new StringBuilder(sc.next());
        System.out.print("Введите сумму: ");
        StringBuilder e = new StringBuilder(sc.next());
        System.out.printf("%s + %s = %s", q, w, e);


        Boolean ReturnValue = Character.isDigit(q.charAt(0));
        if (ReturnValue) {

        }
        System.out.println(ReturnValue);
        char n1 = q.charAt(0);

        char n2 = q.charAt(1);
        char n3 = w.charAt(0);
        char n4 = w.charAt(1);
        char n5 = e.charAt(0);
        char n6 = e.charAt(1);

        System.out.println("\n" + n1 + n2 + n3 + n4 + n5 + n6);




    }
}

//Вывести все простые числа от 1 до 1000

public class HW_1_2 {
    public static void main(String[] args) {

        for (int i = 2; i  < 1000; i++) {
            boolean bool = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.print(i + " ");
            }
        }
    }
}

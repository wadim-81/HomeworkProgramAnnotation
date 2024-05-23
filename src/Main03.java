public class Main03 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);



        }

        int j = 1;
        do {
            System.out.printf("Квадрат числа %d равен %d \n", j, j * j);
            j++;
        } while (j < 9);

        int k = 1;
        while (k < 10) {
            System.out.printf("Квадрат числа %d равен %d \n", k, k * k);
            k++;
       //     O(n) время выполнения кода будет увеличиваться по мере увеличения размера входных чисел.
    }
}}

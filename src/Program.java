import java.util.Scanner;

public class Program {


        public static void main(String[] args) {

   /* 1      Домашнее задание:

Определите временную сложность данных алгоритмов и объясните свой выбор!

            Scanner in = new Scanner(System.in);


            System.out.print("Введите имя: ");
            String name = in.nextLine();
            System.out.print("Возраст: ");
            int age = in.nextInt();
            System.out.print("Введите рост: ");
            float height = in.nextFloat();
            System.out.printf("Имя: %s  Возраст: %d  Рост: %.2f \n", name, age, height);
            in.close();

//константная сложность o(1) операция проходит напрямую что вводим то и получаем
        }


// 2
    int num1 = 6;
    int num2 = 8;
        if (num1 > num2) {
        System.out.println("Первое число больше второго");
    } else if (num1 < num2) {
        System.out.println("Первое число меньше второго");
    } else {
        System.out.println("Числа равны");
    }
//константная сложность o(1) независимо от значений num1 и num2, операции сравнения и вывода на экран будут выполняться за постоянное время.
// 3
        for (int i = 1; i < 9; i++) {
        System.out.printf("Квадрат числа %d равен %d \n", i, i * i);


    }

    int j = 1;
        do {
        System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        j++;
    } while (j < 9);

    int k = 1;
        while (k < 10) {
        System.out.printf("Квадрат числа %d равен %d \n", k, k * k);
        k++;
         O(n) время выполнения кода будет увеличиваться по мере увеличения размера входных чисел.
    }

// 4
    public static void main(String[] args) {
        int n = 100;
        for (int i = 0; i < n * n; i++) {
            for (int j = 0; j < n * n; j++) {
                System.out.println(1);
                бесконечный цикл который следует избегать o(n^4)
            }
        }
    }

// 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n * n; i++) {
            System.out.println(1);
           O(n^2) - квадратичная временная сложность время выполнения
           кода будет увеличиваться в зависимости от входных данных входных данных.
        }
    }

// 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n * n * 0; i++) {
            System.out.println(1);
        }
 O(1) время остается постоянным и не зависит от размера входных данных.
        */
    }}
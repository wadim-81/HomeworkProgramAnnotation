public class Main02 {
    public static void main(String[] args) {
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
    }
}

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] salaries = generateRandomArray();
        int sumSalaries = 0;
//        for (int i = 0; i < salaries.length; i++) {
//            sumSalaries = sumSalaries + salaries[i];
//            System.out.println(+sumSalaries);
        for (int element : salaries)
            sumSalaries = sumSalaries += element;
        System.out.println(" Сумма затрат за месяц составила " + sumSalaries);
    }

    public static void task2() {

        System.out.println("Задача 2");
        int[] salaries = generateRandomArray();
        int maxSalaries = -1;
        for (int elementMax : salaries) {
            if (elementMax > maxSalaries) {
                maxSalaries = elementMax;
            }
        }
        int minSalaries = salaries[0];
        for (int elementMin : salaries) {
            if (elementMin < minSalaries) {
                minSalaries = elementMin;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalaries + " рублей. Максимальная сумма трат за день составила " + maxSalaries + "рублей ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] salaries = generateRandomArray();
        double avarageSalaries = 0;
        for (int element : salaries) {
            avarageSalaries = avarageSalaries += element;
        }
        System.out.println(" Средняя сумма трат за месяц составила " + avarageSalaries/30);
    }

    public static void task4() {
        System.out.println(" Задача 4");
        char[] reversFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (char i = (char) (reversFullName.length - 1); i < reversFullName.length; i--) {
            System.out.print(reversFullName[i]);
        }
    }
}











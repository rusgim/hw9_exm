import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //задание 1
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr ) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила: " + sum + " рублей");
        //задание 2
        System.out.println("");
        int[] arr1 = generateRandomArray();
        int min = arr1[0];
        int max = arr1[0];
        for (int element : arr1) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальные затраты за день " + min);
        System.out.println("Максимальные затраты за день " + max);
        //задание 3
        System.out.println("");
        int[] numberArray = generateRandomArray();
        int sum1 = 0;
        for (int i : numberArray) {
            sum1 += i;
        }
        System.out.println(sum1 / (float) numberArray.length);
        //задание 4
        System.out.println("");
        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reserveFullName.length - 1; i >= 0; i--) {
            System.out.print(reserveFullName[i]);
        }
    }
}
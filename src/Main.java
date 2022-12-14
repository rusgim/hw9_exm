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
        System.out.println("Сумма трат за месяц: " + sum);
        //задание 2
        System.out.println("");
        int[] arr1 = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
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

    }

}
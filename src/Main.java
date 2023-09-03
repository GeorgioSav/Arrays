import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println();

        //Task 1
        System.out.println("Task 1");
        int[] weight = new int[12];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.println(weight[i]);
        }
        System.out.println();

        double[] doubleArr = new double[12];
        doubleArr[0] = 0;
        doubleArr[1] = 1.57;
        doubleArr[2] = 7.654;
        doubleArr[3] = 9.986;
        for (int i = 0; i < 12; i++) {
            System.out.println(doubleArr[i]);
        }
        System.out.println();

        int[] fruits = new int[12];
        fruits [0] = 100;
        fruits [1] = 50;
        fruits [2] = 10;
        fruits [3] = 38;
        fruits [4] = 15;
        for (int i = 0; i < 12; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();


        //Task 2
        System.out.println("Task 2");
        System.out.println(Arrays.toString(weight));
        System.out.println();

        System.out.println(Arrays.toString(doubleArr));
        System.out.println();

        System.out.println(Arrays.toString(fruits));
        System.out.println();

        //Task 3
        System.out.println("Task 3");


        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(Arrays.toString(new int[]{weight[i]}));
        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(Arrays.toString(new int[]{(int) doubleArr[i]}));
        }
        System.out.println();

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(fruits[i]);
        }
    }
}
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input array size
            int N = sc.nextInt();

            // Create array
            int[] arr = new int[N];

            // Input N integers
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // Input index
            int index = sc.nextInt();

            // Input divisor
            int divisor = sc.nextInt();

            // Perform division
            int result = arr[index] / divisor;

            System.out.println(result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero error");
        }

        sc.close();
    }
}


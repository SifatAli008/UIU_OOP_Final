package A;



import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[10];
        try {
            for (int i = 0; i < data.length; i++) {
                try {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    data[a] = b / c;
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input");
                    sc.nextLine(); 
                    i--; 
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index out of bounds");
                }
            }
        } finally {
            System.out.println("Done!");
            sc.close(); 
        }
    }
}

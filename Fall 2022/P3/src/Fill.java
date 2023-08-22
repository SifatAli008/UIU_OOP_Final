
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Fill {

    public static void main(String[] args) throws IOException {
        try {
            File f1 = new File("input.txt");

            Scanner in = new Scanner(f1);
            while (in.hasNext()) {
                try {
                    int number1 = in.nextInt();
                    int number2 = in.nextInt();
                    int total = number1 + number2;

                    FileWriter f2 = new FileWriter("output.txt", true);
                    f2.write(String.valueOf(total));
                    f2.write("\n");

                    f2.close();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input: " + e.getMessage());
                    in.nextLine(); // consume the invalid input and move on
                }
            }
            in.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

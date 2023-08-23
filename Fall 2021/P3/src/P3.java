
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        try {
            File fr = new File("input.txt");
            Scanner in = new Scanner(fr);
            while (in.hasNext()) {
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                int num3 = num1 + num2;
                System.out.println(num3);
                try {
                    FileWriter fw = new FileWriter("out.txt", true);

                    fw.write(num3 + "\n");
                    fw.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

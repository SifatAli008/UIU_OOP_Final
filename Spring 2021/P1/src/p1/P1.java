package p1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        try {
            File fr = new File("in.txt");
            Scanner in = new Scanner(fr);

            int i = 0;
            while (in.hasNext()) {
                String str = in.next();
                System.out.println(str);
                i++;
            }

            int num = i - 5;

            in.close();

            in = new Scanner(fr);

            int j = 0;
            while (in.hasNext()) {
                String str = in.next();
                if (j >= num) {
                    try {
                        FileWriter fw = new FileWriter("out.txt", true);
                        fw.write(str + "\n");
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                j++;
            }

            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

package A;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        try {
            File fr = new File("in.txt");
            Scanner in = new Scanner(System.in);
            while (in.hasNext()) {
                String line = in.next();
                try {
                  FileWriter fw = new FileWriter("out.txt",true);
                  fw.write(line);
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

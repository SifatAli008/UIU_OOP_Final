import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File fr = new File("Sections.txt");
            Scanner in = new Scanner(fr);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] str = line.split("-");
                try {
                    FileWriter fw = new FileWriter("Output.txt", true);
                    int totalStudents = 0;
                    for (int i = 1; i < str.length; i++) {
                        totalStudents += Integer.parseInt(str[i]);
                    }
                    fw.write(str[0] + "-" + totalStudents + "\n");
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

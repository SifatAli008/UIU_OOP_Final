
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            File file1 = new File("input.txt");
            Scanner in = new Scanner(file1);
            
            int i = 0;
            
            while (in.hasNext()) {
               int num1 = in.nextInt();
               int num2 = in.nextInt();
                int sum = num1 + num2;
                try {
                    FileWriter file2 = new FileWriter("Output.txt",true);

                    String str = "Line " + (i + 1) +" : "+ sum;
                    file2.write(str+"\n");
                 
                    i++;
                    file2.close();
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

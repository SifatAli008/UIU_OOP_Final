package B;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        ExceptionDemo obj = new ExceptionDemo();
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int work_experience = input.nextInt();
        try {
            obj.UserCheck(age, work_experience);
            System.out.println("User is eligible for Elderly pension.");
        } catch (InvalidUserException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}

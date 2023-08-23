package A;

import java.util.Scanner;

public class calculator {

    String name = null;
    int num1;
    int num2;

    public calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        this.num1 = input.nextInt();
        System.out.println("Enter the Second number.");
        this.num2 = input.nextInt();
    }

    public void divide() {
        System.out.println(num1 / num2);

    }

    public void display_namelength() {
        System.out.println(name.length());

    }
}

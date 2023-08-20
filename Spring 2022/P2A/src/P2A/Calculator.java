package P2A;

import java.util.Scanner;

public class Calculator {
    String name = null;
    int num1;
    int num2;
    
    public Calculator(){
        try{
    Scanner input = new  Scanner (System.in);
        System.out.println("Enter the first number : ");
        this.num1=input.nextInt();
         System.out.println("Enter the second number : ");
        this.num2=input.nextInt();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public void divide(){
         try{
        System.out.println(num1/num2);
         }
         catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void display_namelength(){
        try{
        System.out.println(name.length());
         }
         catch(Exception e){
            System.out.println(e);
        }
    }
}

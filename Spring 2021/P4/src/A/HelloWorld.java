package A;

public class HelloWorld {
    static int a;
    static int b;
    static int c;
    
    
    void firstMethod(){
    this.a=5;
    }
    
    static void secondMethod(){
        System.out.println("b = "+b);
        System.out.println("c = "+c);
        HelloWorld.a=5;
    }
}

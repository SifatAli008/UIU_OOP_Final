package B;

public class InterfaceTest implements Interface1,Interface2 {

    @Override
    public void methodA() {
        System.out.println("Method A");
    }
    
     @Override
    public void methodB(){
        System.out.println("Method B");
    }
    
}

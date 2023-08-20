
package p6;


public class Docter implements Human,Engineer {

    @Override
    public void study() {
        System.out.println("Studying Human Anatomy");
    }

    @Override
    public void work() {
        System.out.println("Dissecting Human Body");
    }
    
}

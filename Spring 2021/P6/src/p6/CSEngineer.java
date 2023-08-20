
package p6;

public class CSEngineer implements Human,Engineer {
      @Override
    public void study() {
        System.out.println("Solving ODE/PDE");
    }

    @Override
    public void work() {
        System.out.println("Coding in Java");
    }
}

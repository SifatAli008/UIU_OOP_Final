
package A;

public class Concrete implements P3{

    @Override
    public double h2(int x) {
        return P3.super.h2(x);
    }

    @Override
    public String k1() {
        return P3.super.k1(); 
    }

    @Override
    public void k2() {
        P3.super.k2();
    }
    
}

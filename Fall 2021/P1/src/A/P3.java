
package A;

public interface P3 extends P1,P2{

    @Override
    public default double h2(int x) {
           return (double) x;
    }

    @Override
   public default String k1() {    
    String name = "k1";
    return name;
}

    @Override
    public default void k2() {
        System.out.println("k2");
    }
    
}

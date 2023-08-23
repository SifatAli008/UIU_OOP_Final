package A;

public class ExceptionTest {

    public static void main(String[] args) {
        try {
            calculator obj = new calculator();
            obj.divide();
            obj.display_namelength();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

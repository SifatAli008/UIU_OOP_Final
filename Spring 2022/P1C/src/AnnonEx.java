
public class AnnonEx {

    public static void main(String[] args) {
       

         Person enginer = new Person() {

            @Override
            public void introduce() {
                System.out.println("Hello, I'm an Enginer.");
            }
        };
        
         Person doctor = new Person() {

            @Override
            public void introduce() {
                System.out.println("Hello, I'm an Docter.");
            }
        };
         
        enginer.introduce(); 
        doctor.introduce(); 
    }

}

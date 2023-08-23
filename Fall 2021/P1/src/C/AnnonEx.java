
package C;

public class AnnonEx {
   
        public static void main(String[] args) {
          Person doctor = new Person() {

        @Override
        public void introduce() {
            System.out.println("Doctor");
        }
    };
   
    Person tec = new Person() {
        @Override
        public void introduce() {
            System.out.println("eng");
        }
    };
       doctor.introduce();
       tec.introduce();
       
       
       
    }
    
     
}

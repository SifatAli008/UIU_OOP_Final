
class AnnonEx{

    public static void main(String[] args) {

        Person engineer = new Person(){
            @Override
            public void introduce() {
                 System.out.println("Hi, I'm an engineer.");
            }
        
        };
        
        Person doctor = new Person(){
         @Override
            public void introduce() {
                 System.out.println("Hi, I'm an doctor.");
            }
        };
        
        engineer.introduce();
        doctor.introduce();
    }
}

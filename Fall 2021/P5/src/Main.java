import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student("Wizard", 3, 3.88));
        list.add(new Student("Peter", 2, 3.5));
        list.add(new Student("Wanda", 1, 3.88));
        list.add(new Student("Thanos", 41, 3.9));
        list.add(new Student("Yelena", 7, 3.75));
        list.add(new Student("Thor", 15, 3.89));

      
        boolean peterExists = false;
        
        for (Student s : list) {
            if (s.getName().equals("Peter")) {
                peterExists = true;
                break;
            }
        }
        
        System.out.println(peterExists ? "Peter exists in the list" : "Peter does not exist in the list");

   
        Collections.sort(list, new CGPAComparator().reversed());
        for (Student s : list) {
            System.out.println(s);
        }
    }

}





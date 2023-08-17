
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Student> alist = new ArrayList<>();
        alist.add(new Student("Sonet", 15, 3.8));
        alist.add(new Student("Zhang", 17, 3.9));
        alist.add(new Student("Buffon", 20, 3.6));

        Student query = new Student("Zhang", 0, 0);

        if (alist.contains(query)) {
            System.out.println("Student " + query.getName() + " found in the list.");
        } else {
            System.out.println("Student " + query.getName() + " not found in the list.");
        }
        
        
        Collections.sort(alist, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        
     
     for(Student e : alist){
         System.out.println(e);
     }
        
    }

}

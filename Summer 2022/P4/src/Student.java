class Student {
    public String name;
    public int age;
    public double cgpa;

    public Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return name.equals(s.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getCgpa() {
        return cgpa;
    }
    
    @Override
   public String toString(){
    return name+" , "+age+" , "+cgpa;
   }
    
}

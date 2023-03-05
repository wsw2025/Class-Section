public class Student {
    private int id;
    private String firstName;
    private String lastName;
    int age;
    int yearLevel;
    static int studentCount;

    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
    }

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearLevel(){
        return this.yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public int getStudentCount(){
        return this.studentCount;
    }
    public boolean equals(Student student){
        if(this.firstName == student.getFirstName() && this.lastName == student.getLastName() && this.age==student.getAge() && this.yearLevel == student.getYearLevel()) return true;
        return false;
    }
    public String toString(){
        return "Student{id=" + this.id+", firstName="+this.firstName+", lastName="+this.lastName+", age="+this.age+"}";
    }
}

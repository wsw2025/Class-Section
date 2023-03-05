import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList();
    }
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getYearLevel(){
        return this.yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void addStudent(Student student){
        for (Student i : students){
            if(i.equals(student)) return;
        }
        if(student.getYearLevel()==this.yearLevel) students.add(student);
    }
    public void removeStudent(Student student){
        if(students.contains(student)){
            for (int i = 0; i < students.size(); i++){
                if(students.get(i).equals(student)){
                    students.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", students=" + students +
                '}';
    }
}

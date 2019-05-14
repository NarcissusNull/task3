package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> studentList;

    Klass(int number) {
        studentList = new ArrayList<>();
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }

    public void assignLeader(Student student) {
        if(studentList.contains(student)){
            setLeader(student);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public void appendMember(Student student) {
        if(!studentList.contains(student)){
            studentList.add(student);
        }
    }

    public boolean isIn(Student student){
        return student.getKlass().getNumber() == getNumber();
    }
}

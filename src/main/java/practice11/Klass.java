package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private List<Teacher> teachers = new ArrayList<>();
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
        if (studentList.contains(student)) {
            setLeader(student);
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
        notifyEveryOne(" I know " + leader.getName() + " become Leader of " + getDisplayName() + ".");
    }

    public void appendMember(Student student) {
        if (!studentList.contains(student)) {
            studentList.add(student);
            notifyEveryOne(" I know " + student.getName() + " has joined " + getDisplayName() + ".");
        }
    }

    public boolean isIn(Student student) {
        return student.getKlass().getNumber() == getNumber();
    }

    public void attach(Teacher teacher) {
        teachers.add(teacher);
    }

    public void notifyEveryOne(String newState) {
        for (Teacher teacher : teachers) {
            teacher.update("I am " + teacher.getName() + "." + newState + "\n");
        }
    }
}

package practice05;

public class Student extends Person {
    private int klass;

    public Student(String tom, int i, int ki) {
        super(tom, i);
        this.klass = ki;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at Class " + getKlass() + ".";
    }
}


package practice07;

public class Student extends Person {
    private Klass klass;

    public Student(String tom, int i, Klass ki) {
        super(tom, i);
        this.klass = ki;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a Student. I am at " + getKlass().getDisplayName() + ".";
    }
}


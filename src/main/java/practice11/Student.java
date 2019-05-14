package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(int id, String name, int i, Klass ki) {
        super(id, name, i);
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
        if (getKlass().getLeader() != null && getId() == getKlass().getLeader().getId()) {
            return super.introduce() + " I am a Student. I am Leader of " + getKlass().getDisplayName() + ".";
        } else {
            return super.introduce() + " I am a Student. I am at " + getKlass().getDisplayName() + ".";
        }
    }
}


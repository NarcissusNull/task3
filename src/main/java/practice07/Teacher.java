package practice07;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String tom, int i, Klass ki) {
        super(tom, i);
        setKlass(ki);
    }

    public Teacher(String tom, int i) {
        super(tom, i);
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach " + klass.getDisplayName() + ".";
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == getKlass().getNumber()) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}

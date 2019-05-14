package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String tom, int i, int ki) {
        super(tom, i);
        setKlass(ki);
    }

    public Teacher(String tom, int i) {
        super(tom, i);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
        }
    }
}

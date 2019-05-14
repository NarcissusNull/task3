package practice11;

import java.util.Collection;
import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> klassList;

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        setKlassList(klass);
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    @Override
    public String introduce() {
        if (klassList == null || klassList.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            String temp = klassList.stream().map(Klass::getNumber).map(String::valueOf).reduce((R, T) -> R + ", " + T).get();
            return super.introduce() + " I am a Teacher. I teach Class " + temp + ".";
        }
    }

    public String introduceWith(Student student) {
        if (getKlassList().stream().anyMatch(e -> e.getNumber() == student.getKlass().getNumber())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public LinkedList<Klass> getKlassList() {
        return klassList;
    }

    public void setKlassList(LinkedList<Klass> klassList) {
        this.klassList = klassList;
        this.klassList.forEach(e->e.attach(this));
    }

    public LinkedList<Klass> getClasses() {
        return this.klassList;
    }

    public boolean isTeaching(Student student) {
        return klassList.stream().anyMatch(e -> e.getNumber() == student.getKlass().getNumber());
    }

    public void update(String newState) {
        System.out.print(newState);
    }
}

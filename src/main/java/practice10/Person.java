package practice10;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object person) {
        return person != null && ((Person) person).getId() == getId();
    }
}

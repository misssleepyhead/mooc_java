package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(age<0 || age>120 || name == null|| name.equals("")||name.length()>40){
        throw new IllegalArgumentException("not a valid value");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

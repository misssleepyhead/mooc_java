
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;

        }

        if (!(compared instanceof Person)) {
            return false;

        }
        Person comparedp = (Person) compared;

        if (this.birthday.equals(comparedp.birthday) && this.height == comparedp.height && this.weight == comparedp.weight && this.name == comparedp.name) {
            return true;
        }

        return false;
    }

}

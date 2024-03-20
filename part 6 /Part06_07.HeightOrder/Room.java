
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.size() == 0;

    }

    public ArrayList<Person> getPersons() {

        return persons;
    }

    public Person shortest() {
        Person shortest = new Person("", 3000);

        if (persons.size() == 0) {
            shortest = null;

        }
        for (Person person : persons) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }

        }
        return shortest;
    }

    public Person take() {
        Person p = this.shortest();
        persons.remove(p);
        return p;
    }
}

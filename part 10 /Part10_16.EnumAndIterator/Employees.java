
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employees.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(p -> this.employees.add(p));
    }

    public void print() {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation()== education){
                System.out.println(next);
            
            }
        }

    }
    
    public void fire(Education education){
          Iterator<Person> iterator = this.employees.iterator();

        while (iterator.hasNext()) {
            Person next = iterator.next();
            if(next.getEducation()== education){
                iterator.remove();
            
            }
        }  
    
    
    
    }
}

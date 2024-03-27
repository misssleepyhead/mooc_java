
import java.util.ArrayList;

public class BirdWatcher {

    private ArrayList<Bird> birds;

    public BirdWatcher() {
        this.birds = new ArrayList<>();
    }

    public void add(Bird bird) {
        birds.add(bird);

    }

    public void observation(String name) {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                found = true;
                bird.observation();
            }
        }
        if (found == false) {
            System.out.println("Not a bird!");

        }
    }

    public void all() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    public void one(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }

        }
    }
}

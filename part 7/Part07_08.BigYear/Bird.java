
public class Bird {

    private String name;
    private String latin;
    private int observation;

    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }

    public void observation() {
        this.observation++;

    }

    public String getLatin() {
        return latin;
    }

    public String getName() {
        return name;
    }

    public int getObservation() {
        return observation;
    }

    @Override
    public String toString() {
        if(this.observation == 1){
        return this.name + " (" + this.latin + "): " + this.observation+ " observation";
        }
        return this.name + " (" + this.latin + "): " + this.observation+ " observations";
    }

}

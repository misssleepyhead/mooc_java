
public class MainProgram {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(10);
        c1.decrease();
        c2.decrease(5);
        System.out.println(c1);
        System.out.println(c2);

    }
}

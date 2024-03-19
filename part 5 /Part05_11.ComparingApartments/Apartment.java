
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;

    }

    public int priceDifference(Apartment compared) {
        int a1 = this.price(this);
        int a2 = price(compared);

        if (a1 > a2) {
            return a1 - a2;

        } else {
            return a2 - a1;

        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int a1 = this.price(this);
        int a2 = price(compared);

        return a1 > a2;
    }

    public int price(Apartment a) {
        return a.squares * a.princePerSquare;

    }
}

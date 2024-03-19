
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents); // create a new Money object that has the correct worth

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;

        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;

            }

        }
        return false;
    }

    public Money minus(Money decreaser) {
        int new_euros = 0;
        int new_cents = 0;
        if (this.euros - decreaser.euros >= 0) {
            new_euros = this.euros - decreaser.euros;
            if (this.cents - decreaser.cents < 0) {
                new_euros = this.euros - 1 - decreaser.euros;
                new_cents = this.cents + 100;
                new_cents = new_cents - decreaser.cents;
            } else if (this.cents - decreaser.cents >= 0) {
                new_cents = this.cents - decreaser.cents;

            }
        }

        Money newMoney = new Money(new_euros, new_cents); // create a new Money object that has the correct worth

        return newMoney;

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}

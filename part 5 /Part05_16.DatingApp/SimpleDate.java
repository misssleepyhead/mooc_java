
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public void advance() {
        this.advance(1);

    }

    public void advance(int howManyDays) {
        if ((this.day + howManyDays) <= 30) {
            this.day += howManyDays;
        } else if ((this.day + howManyDays) > 30) {
            if (this.month != 12) {
                this.day = ((this.day + howManyDays) - 30);
                this.month++;
            } else {
                this.day = ((this.day + howManyDays) - 30);
                this.month = 1;
                this.year++;

            }
        }

    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);

        // do something..
        return newDate;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}

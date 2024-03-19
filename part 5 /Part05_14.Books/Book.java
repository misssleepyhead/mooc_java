
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object b) {

        if (this == b) {
            return true;

        }
        if (!(b instanceof Book)) {
            return false;

        }
        Book compared = (Book) b;

        if (this.name.equals(compared.name) && this.publicationYear == compared.publicationYear) {
            return true;

        }
        return false;

    }

}

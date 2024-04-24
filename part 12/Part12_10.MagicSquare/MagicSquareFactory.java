
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int row = 0;
        int column = size / 2;

        for (int i = 1; i <= size * size; i++) {
            square.placeValue(row, column, i);
            int rowHelper = row;
            int colHelper = column;
            row -= 1;
            column += 1;
            if (row < 0) {
                row = size - 1;
            }
            if (column > size - 1) {
                column = 0;
            }
            if (square.readValue(row, column) > 0) {
                row = rowHelper + 1;
                column = colHelper;
            }
            //square.placeValue(row, column, i);
        }
        return square;
    }

}

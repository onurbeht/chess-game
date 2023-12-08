package boardGame;

public class Position {
    private int row;
    private int column;

    //Constructor
    public Position(int row, int column) {
        this.setRow(row);
        this.setColumn(column);
    }

    //Métodos
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }

    public void setValues(int row, int column) {
        this.setRow(row);
        this.setColumn(column);
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }
}

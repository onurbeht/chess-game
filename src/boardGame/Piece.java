package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    //Constructor
    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    //Métodos
    protected Board getBoard() {
        return board;
    }
}

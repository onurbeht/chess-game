package boardgame;

public abstract class Piece {
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

    public abstract boolean[][] possibleMoves();
    
    public boolean possibleMove (Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for(int r=0; r< mat.length; r++) {
            for(int c=0; c<mat.length; c++){
                if(mat[r][c]){
                    return true;
                }
            }
        }
        return false;
    }
}

package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    //Constructor
    public ChessMatch () {
        board = new Board(8,8);
        initialSetup();
    }

    //Métodos
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for(int r=0; r < board.getRows(); r++) {
            for(int c=0; c < board.getColumns(); c++){
                mat[r][c] = (ChessPiece) board.piece(r, c);
            }
        }
        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(0,0));
        board.placePiece(new Rook(board, Color.WHITE), new Position(0,7));
        board.placePiece(new King(board, Color.WHITE), new Position(0,4));
    }
}

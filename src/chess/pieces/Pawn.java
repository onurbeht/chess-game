package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        if(getColor() == Color.WHITE) {
            p.setValues(position.getRow() - 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            Position p2 = new Position(position.getRow() -2 , position.getColumn());
            if(getMoveCount() == 0 && getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
                mat[p2.getRow()][p2.getColumn()] = true;
            }
            Position pLeft = new Position(position.getRow() -1, position.getColumn() -1);
            if(getBoard().positionExists(pLeft) &&isThereOpponentPiece(pLeft)) {
                mat[pLeft.getRow()][pLeft.getColumn()] = true;
            }
            Position pRight = new Position(position.getRow() -1, position.getColumn() +  1);
            if(getBoard().positionExists(pRight) && isThereOpponentPiece(pRight)) {
                mat[pRight.getRow()][pRight.getColumn()] = true;
            }
        } else {
            p.setValues(position.getRow() + 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            Position p2 = new Position(position.getRow() + 2 , position.getColumn());
            if(getMoveCount() == 0 && getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
                mat[p2.getRow()][p2.getColumn()] = true;
            }
            Position pLeft = new Position(position.getRow() + 1, position.getColumn() -1);
            if(getBoard().positionExists(pLeft) && isThereOpponentPiece(pLeft)) {
                mat[pLeft.getRow()][pLeft.getColumn()] = true;
            }
            Position pRight = new Position(position.getRow() + 1, position.getColumn() + 1);
            if(getBoard().positionExists(pRight) && isThereOpponentPiece(pRight)) {
                mat[pRight.getRow()][pRight.getColumn()] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString() {
        return "P";
    }
}

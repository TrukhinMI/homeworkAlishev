package Day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece[] chessPieces = new ChessPiece[8];
        for (int i = 0; i < chessPieces.length; i++){
            if (i < 4)
                chessPieces[i] = ChessPiece.PAWN_WHITE;
            else
                chessPieces[i]  = ChessPiece.ROOK_BLACK;

        }



        for (int i = 0; i < chessPieces.length; i++){
            System.out.print(chessPieces[i].getDesignation());
        }
    }
}

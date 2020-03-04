import java.util.ArrayList;
import java.util.Arrays;

public class Driver {


    public static void main(String[] args) {

        Pawn pawn = new Pawn(true);
        Bishop bishop = new Bishop(true);
        Knight knight = new Knight(true);
        Rook rook = new Rook(true);
        Queen queen = new Queen(true);
        King king = new King(true);


        Pawn pawnb = new Pawn(false);
        Bishop bishopb = new Bishop(false);
        Knight knightb = new Knight(false);
        Rook rookb = new Rook(false);
        Queen queenb = new Queen(false);
        King kingb = new King(false);



        // Add ArrayList
        ArrayList<Piece> pieces = new ArrayList<>();

        pieces.add(pawn);
        pieces.add(bishop);
        pieces.add(knight);
        pieces.add(rook);
        pieces.add(queen);
        pieces.add(king);

        pieces.add(pawnb);
        pieces.add(bishopb);
        pieces.add(knightb);
        pieces.add(rookb);
        pieces.add(queenb);
        pieces.add(kingb);


        Pawn p1 = new Pawn(1, true, true, new Queen(true));
        Pawn p2 = new Pawn(1, true, false, null);
        Pawn p3 = new Pawn(1, false, false, null);
        Pawn p4 = new Pawn(1, false, true, new Queen(false));
        Pawn p5 = new Pawn(1, true, true, new Knight(true));




        for (Piece p : pieces){
            System.out.println(p.toString());
            p.move();
        }


        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));




    }

}

class Pawn extends Piece{
    private boolean promoted = false;
    private Piece newPiece;

    public Pawn(){
        super(true, 1);
    }

    public Pawn(boolean white){
        super(white,1);
    }

    public Pawn(int value, boolean White, boolean promoted, Piece newPiece){

    }

    @Override
    public String toString() {
        return "Pawn{Value = " + getValue() + "}";
    }

    @Override
    public void move() {
        System.out.println("Forward1");
    }
    @Override
    public  boolean equals(Object p) {
        return super.getValue() == ((Piece)p).getValue() && ((Piece) p).isWhite() == super.isWhite() && this.isPromoted() == ((Pawn)p).isPromoted();

    }




    public void promote(Piece newPiece){
        if (promoted) {
            setValue(newPiece.getValue());
        }
    }

    public Piece getNewPiece(){
        return newPiece;

    }

    public boolean isPromoted(){
        return promoted;
    }

    public void setNewPiece(){

    }
    public void setPromoted(){
        this.promoted = promoted;
    }


}

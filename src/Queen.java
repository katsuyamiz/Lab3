class Queen extends Piece {

    public Queen(){
        super(true,9);
    }
    public Queen(boolean white){
        super(white,9);

    }

    public void move(){
        System.out.println("Like bishop and rook");
    }

    @Override
    public String toString() {
       return  "Queen{value =  "+ getValue() + "}";
    }

    public void value(){
        setValue(9);
    }
}

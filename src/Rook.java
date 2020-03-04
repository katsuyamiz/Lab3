class Rook extends Piece{

    public Rook(){
        super(true,5);
    }
    public Rook(boolean white){
        super(white, 5);

    }
    public void move(){
        System.out.println("Horizontally or vertically");
    }

    @Override
    public String toString() {
        return "Rook{value =  "+ getValue() + "}";
    }

    public void value(){
        setValue(5);
    }
}

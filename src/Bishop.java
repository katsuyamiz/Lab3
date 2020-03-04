class Bishop extends Piece{
    public Bishop(){
        super(true, 3);
    }
    public Bishop(boolean white){
        super(white, 3);

    }
    public void move(){
        System.out.println("Diagonally");
    }

    @Override
    public String toString() {
        return null;
    }

    public void value(){
        setValue(3);
    }
}

class Knight extends Piece{

    public Knight(){
        super(true,2);
    }
    public Knight(boolean white){
        super(white, 2);

    }

    public void move(){
        System.out.println("Like an L");
    }

    @Override
    public String toString() {
        return "Knight{value =  "+ getValue() + "}";
    }

    public void value(){
        setValue(2);
    }
}

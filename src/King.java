class King extends Piece{

    public King(){
        super(true, 1_000);
    }
    public King(boolean white){
        super(white, 1_000);

    }
    public void move(){
        System.out.println("One square");
    }

    @Override
    public String toString() {
        return "King{value =  "+ getValue() + "}";
    }


    public void value(){
        setValue(1000);
    }
}


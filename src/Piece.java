public abstract class Piece {

    private int value;
    private boolean isWhite = true;

    public Piece() {
        this.value = getValue();
        this.isWhite = isWhite();
    }

    public Piece(boolean isWhite, int value) {
        this.value = value;
        this.isWhite = isWhite;

    }

    public int getValue() {
        return value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }


    public abstract void move();


    public abstract String toString();

    @Override
    public boolean equals(Object p) {
        return this.value == ((Piece)p).getValue() && ((Piece)p).isWhite() == this.isWhite();

    }

}


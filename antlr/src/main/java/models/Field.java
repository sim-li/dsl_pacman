package models;

public class Field {
    private boolean isShip;

    public Field() {
        this.isShip = false;
    }

    public void setIsShip() {
        this.isShip = true;
    }

    public boolean isShip() {
        return isShip;
    }
}

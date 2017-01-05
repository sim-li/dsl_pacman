package models;

public class AiMove implements Move {
    protected int xCord;
    protected int yCord;
    protected String xCordString;
    protected boolean random;

    public AiMove() {
        this.xCord = -1;
        this.yCord = -1;
        this.xCordString = "";
        this.random = false;
    }

    public void setRandom() {
        this.random = true;
    }

    public boolean isRandom() {
        return this.random;
    }

    public int getXCord() {
        return xCord;
    }

    public int getYCord() {
        return yCord;
    }

    public void setXCord(int cord) {
        this.xCord = cord;
    }

    public void setYCord(int cord) {
        this.yCord = cord;
    }

    public void setXCordString(String xCordChar) {
        this.xCordString = xCordChar;
    }

    @Override
    public String toString() {
        return "Der Computer feuert auf " + xCordString + yCord;
    }

    public String toModelRepresentation() {
        final String QUOTE = "\"";
        return QUOTE + xCordString + yCord + QUOTE;
    }
}

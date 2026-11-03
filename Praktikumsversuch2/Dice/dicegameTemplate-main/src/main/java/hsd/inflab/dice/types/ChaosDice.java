package hsd.inflab.dice.types;

public class ChaosDice extends Dice {

    private int sides;
    @Override
    public int roll() {
        this.sides=getRandomNumber(4, 20);
        return getRandomNumber(1, sides);
    }

    @Override
    public int getSides() {
        return sides;
    }
}
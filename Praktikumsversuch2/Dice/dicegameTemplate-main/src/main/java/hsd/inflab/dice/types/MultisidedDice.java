package hsd.inflab.dice.types;

public class MultisidedDice extends Dice {

    private int sides;
    public void RegularDice (int sides){
        this.sides=sides;
    }
    @Override
    public int roll() {
        return getRandomNumber(1, sides);
    }

    @Override
    public int getSides() {
        return sides;
    }
}

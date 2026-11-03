package hsd.inflab.dice.types;

public class RegularDice extends Dice {

    @Override
    public int roll() {
        return getRandomNumber(1, 6);
    }

    @Override
    public int getSides() {
        return 6;
    }
}

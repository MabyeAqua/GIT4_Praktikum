package hsd.inflab.dice.types;

public class LoadedDice extends Dice {

    @Override
    public int roll() {
        int i = getRandomNumber(0, 1);
        if(i==0){
            return 6;
        }
        else{
            return getRandomNumber(1, 5);
        }
    }

    @Override
    public int getSides() {
        return 6;
    }
}
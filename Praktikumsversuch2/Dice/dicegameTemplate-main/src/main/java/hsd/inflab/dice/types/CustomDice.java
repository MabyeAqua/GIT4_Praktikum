package hsd.inflab.dice.types;

public class CustomDice extends Dice{
    private int sides=10;
    private int roll;
    private boolean ersterWurf=false;
    @Override
    public int roll() {
        if(ersterWurf){
            if(roll>(sides/2)){
            sides++;
            }
            else {
                sides--;
            }
        }
        this.roll = getRandomNumber(1, sides);
        ersterWurf=true;
        return this.roll;
    }

    @Override
    public int getSides() {
        return this.sides;
    }
}
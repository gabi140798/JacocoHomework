package model;

import exceptions.NotEnoughIngredientsException;

import java.util.List;

public class LSD extends Drug{

private int numberOfDragonsSeenDuringTrip;

    public LSD(String name, List<String> ingredients, DrugQuality quality, int numberOfDragonsSeenDuringTrip) throws NotEnoughIngredientsException {
        super(name, ingredients, quality);
        this.numberOfDragonsSeenDuringTrip = numberOfDragonsSeenDuringTrip;
    }

    public int getNumberOfDragonsSeenDuringTrip() {
        return numberOfDragonsSeenDuringTrip;
    }

    @Override
    public DrugType getType(){
        return DrugType.LSD;
    }
}

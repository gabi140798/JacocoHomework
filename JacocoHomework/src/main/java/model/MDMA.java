package model;

import exceptions.NotEnoughIngredientsException;

import java.util.List;

public class MDMA extends Drug{

    private int tripDurationInHours;

    public MDMA(String name, List<String> ingredients, DrugQuality quality, int tripDurationInHours) throws NotEnoughIngredientsException {
        super(name, ingredients, quality);
        this.tripDurationInHours = tripDurationInHours;
    }

    public int getTripDurationInHours() {
        return tripDurationInHours;
    }



    @Override
    public DrugType getType() {
        return DrugType.MDMA;
    }
}

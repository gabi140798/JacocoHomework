package model;

import exceptions.NotEnoughIngredientsException;

import java.util.List;

public class Mephedrone extends Drug{

    private FacialExpression faceType;

    public Mephedrone(String name, List<String> ingredients, DrugQuality quality, FacialExpression faceType) throws NotEnoughIngredientsException {
        super(name, ingredients, quality);
        this.faceType = faceType;
    }

    public FacialExpression getFaceType() {
        return faceType;
    }

    @Override
    public DrugType getType() {
        return DrugType.MEPHEDRON;
    }
}

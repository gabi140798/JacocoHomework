package model;

import exceptions.NotEnoughIngredientsException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Drug {

    private String name;
    private List<String> ingredients;
    private DrugQuality quality;

    private Set<Kid> kids = new HashSet<>();
    private static List<Drug> extension = new ArrayList<>();

    public Drug(String name, List<String> ingredients, DrugQuality quality) throws NotEnoughIngredientsException {
        if (ingredients.size() < 3) {
            throw new NotEnoughIngredientsException();
        }
        this.name = name;
        this.ingredients = ingredients;
        this.quality = quality;
        extension.add(this);
    }

    public double getPrice(){
        return getType().getValue() * getIngredients().size();
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public DrugQuality getQuality() {
        return quality;
    }

    public abstract DrugType getType();

    public Set<Kid> getKids() {
        return kids;
    }

    public static List<Drug> getExtension() {
        return extension;
    }
}

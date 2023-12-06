package model;

public enum DrugType {

    MDMA(8),
    LSD(10),
    MEPHEDRON(12);

    private double value;

    DrugType(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

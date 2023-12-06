package model;

import exceptions.NoDrugException;
import exceptions.TheKidIsAlreadyDeadException;

import java.util.ArrayList;
import java.util.List;

public class Kid {

    private String name;
    private String surname;
    private int age;
    private final int overdose = 5;

    private List<Drug> drugs = new ArrayList<>();
    private static List<Kid> extension = new ArrayList<>();

    public Kid(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        extension.add(this);
    }

    public void buyDrug(Drug drug) throws NoDrugException, TheKidIsAlreadyDeadException {
        if (drug == null) {
            throw new NoDrugException();
        }
        if (drugs.size() < overdose) {
            drugs.add(drug);
            drug.getKids().add(this);
        } else {
            throw new TheKidIsAlreadyDeadException();
        }
    }


    public List<Drug> getDrugs() {
        return drugs;
    }

    public static List<Kid> getExtension() {
        return extension;
    }
}

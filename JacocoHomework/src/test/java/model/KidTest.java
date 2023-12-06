package model;

import exceptions.NoDrugException;
import exceptions.TheKidIsAlreadyDeadException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class KidTest {

    private Kid kid1;
    private Kid kid2;
    private MDMA mdma;


    @Before
    public void init() {
        Kid.getExtension().clear();
        kid1 = new Kid("Macius", "Szczur", 9);
        kid2 = new Kid("Dawidek", "Wąż", 10);
        mdma = new MDMA("Centaurus", Arrays.asList("metyloamina", "piperonal", "x"), DrugQuality.HIGH, 2);
    }

    @Test
    public void shouldReturnCorrectExtensionSize() {
        assertEquals(2, Kid.getExtension().size());
    }

    @Test
    public void shouldReturnFalseIfExtensionSizeIsIncorrect() {
        assertNotEquals(3, Kid.getExtension().size());
    }

    @Test
    public void shouldReturnTrueIfDrugIsOnTheList() {
        kid1.buyDrug(mdma);
        assertTrue(kid1.getDrugs().contains(mdma));
    }

    @Test(expected = TheKidIsAlreadyDeadException.class)
    public void shouldThrowTheKidIsAlreadyDeadExceptionIfBuyMoreThan5Drugs() {
        kid1.buyDrug(mdma);
        kid1.buyDrug(mdma);
        kid1.buyDrug(mdma);
        kid1.buyDrug(mdma);
        kid1.buyDrug(mdma);
        kid1.buyDrug(mdma);
    }

    @Test(expected = NoDrugException.class)
    public void shouldThrowNoDrugExceptionIfBuyNull() {
        kid1.buyDrug(null);
    }


}
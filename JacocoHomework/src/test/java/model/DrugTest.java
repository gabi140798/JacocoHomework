package model;

import exceptions.NotEnoughIngredientsException;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DrugTest {

    private MDMA mdma;
    private LSD lsd;
    private Mephedrone mephedrone;

    @Before
    public void init() {
        Drug.getExtension().clear();
        mdma = new MDMA("Centurion", Arrays.asList("metyloamina", "piperonal", "x"), DrugQuality.HIGH, 1);
        lsd = new LSD("lsd", Arrays.asList("x", "y", "z"), DrugQuality.HIGH, 4);
        mephedrone = new Mephedrone("swirus", Arrays.asList("x", "y", "z"), DrugQuality.HIGH, FacialExpression.SURPRISED);
    }

    @Test
    public void shouldReturnPrice24() {
        double price = mdma.getPrice();
        assertEquals(24, price, 0.1);
    }

    @Test
    public void shouldReturnPrice36() {
        double price = mephedrone.getPrice();
        assertEquals(36, price, 0.1);
    }


    @Test(expected = NotEnoughIngredientsException.class)
    public void shouldThrowNotEnoughIngrednientsException() {
        MDMA slabeMdma = new MDMA("mdma", Arrays.asList("a", "b"), DrugQuality.HIGH, 2);
    }

    @Test
    public void shouldReturnCorrectExtensionSize() {
        assertEquals(3, Drug.getExtension().size());
    }

    @Test
    public void shouldReturnFalseIfExtensionSizeIsIncorrect() {
        assertNotEquals(4, Drug.getExtension().size());
    }

    @Test
    public void shouldReturn10AsValue() {
        assertEquals(10, lsd.getType().getValue(), 0.1);
    }

}
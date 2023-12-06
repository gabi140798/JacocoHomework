package interfaces;

import exceptions.BadQualityException;
import model.Drug;
import model.DrugQuality;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


public class DrugControlerTest {

    @Mock
    private Drug drugMock;

    @Before
    public void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test(expected = BadQualityException.class)
    public void shouldThrowBadQualityExceptionIfDrugQualityIsLow() {
        Mockito.when(drugMock.getQuality()).thenReturn(DrugQuality.LOW);
        DrugControler.checkDrug(drugMock);
    }

    @Test
    public void shouldNotThrowBadQualityExceptionIfDrugQualityIsOtherThanLow() {
        Mockito.when(drugMock.getQuality()).thenReturn(DrugQuality.HIGH);
        DrugControler.checkDrug(drugMock);
    }
}
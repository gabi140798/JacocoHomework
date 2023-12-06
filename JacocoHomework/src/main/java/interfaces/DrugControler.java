package interfaces;

import exceptions.BadQualityException;
import model.Drug;
import model.DrugQuality;

public interface DrugControler {
    static void checkDrug(Drug drug) throws BadQualityException {
        if(drug.getQuality() == DrugQuality.LOW){
            throw new BadQualityException();
        }
    }
}

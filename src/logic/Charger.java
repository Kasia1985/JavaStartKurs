package logic;

import javaBeans.telephonemodel.Telephone;

public class Charger {

    public void charge(Telephone t){
        t.setChargeLevel(t.getChargeLevel() + 1);
    }

}

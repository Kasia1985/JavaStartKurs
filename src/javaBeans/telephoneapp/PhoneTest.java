package javaBeans.telephoneapp;

import javaBeans.telephonemodel.Telephone;
import logic.Charger;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);

        Charger ch = new Charger();
        ch.charge(telephone);
        ch.charge(telephone);
        ch.charge(telephone);
        ch.charge(telephone);
        ch.charge(telephone);
        ch.charge(telephone);
        System.out.println(telephone.getInfo());
    }
}

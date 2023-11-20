package extendsExercise.vehiclePartsShop;

public class ExhaustPart extends Part {
    private boolean iso;


    public boolean isIso() {
        return iso;
    }

    public void setIso(boolean iso) {
        this.iso = iso;
    }
    void printInfo(){
        System.out.println(getSerialNumber() + ", " + getProducerName() + ", " + getModel() + ", "
                + getSeries() + ", " + iso);
    }
}

package extendsExercise.vehiclePartsShop;

import extendsExercise.vehiclePartsShop.Part;

public class Tire extends Part {
    private int size;
    private double width;

    public Tire(int serialNumber, String producerName, String model, String series, int size, double width) {
        setSerialNumber(serialNumber);
        setProducerName(producerName);
        setModel(model);
        setSeries(series);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducerName() + ", " + getModel() + ", "
                + getSeries() + ", " + size + ", " + width);
    }
}

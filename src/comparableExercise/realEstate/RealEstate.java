package comparableExercise.realEstate;

public class RealEstate implements Comparable<RealEstate>{
    private String city;
    private double price;
    private double area;

    public RealEstate(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    double getPricePerSqm(){
        return price/area;
    }

    @Override
    public int compareTo(RealEstate re) {
        return Double.compare(getPricePerSqm(), re.getPricePerSqm());
    }

    @Override
    public String toString() {
        return city + ", " + price + "zl, " + area + "mkw, "
                + String.format("%.2f", getPricePerSqm()) + "zl/mkw";
    }
}

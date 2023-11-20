package superExercise;

public class Pear extends Fruit{
    private static final String TYPE = "pear";
    private String variety;

    public Pear(String variety, int weight) {
        super(TYPE, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", variety: " + variety;
    }
}

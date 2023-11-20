package superExercise;

public class Apple extends Fruit{

    private static final String TYPE = "apple";
    private String variety;


    public Apple(int weight, String variety) {
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

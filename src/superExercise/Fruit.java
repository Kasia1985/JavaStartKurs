package superExercise;

public class Fruit {
    private int weight;
    private String type;

    public Fruit(String type,int weight) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String getInfo(){
        return "Type: " + type + ", weight: " + weight;
    }
}


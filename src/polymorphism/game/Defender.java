package polymorphism.game;

public class Defender extends GameCharacter {
    private double bonusDefense;

    public Defender(String name, int energy, int attackPower, int defensePower, double bonusDefense) {
        super(name, energy, attackPower, defensePower);
        this.bonusDefense = bonusDefense;
    }

    @Override
    double totalDefensePower() {
        return getDefensePower() + bonusDefense * getDefensePower();
    }

    public double getBonus() {
        return bonusDefense;
    }

    public void setBonus(double bonusDefense) {
        this.bonusDefense = bonusDefense;
    }
}

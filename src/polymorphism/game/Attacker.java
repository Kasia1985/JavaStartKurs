package polymorphism.game;

public class Attacker extends GameCharacter {
    private double bonusAttack;

    public Attacker(String name, int energy, int attackPower, int defensePower, double bonusAttack) {
        super(name, energy, attackPower, defensePower);
        this.bonusAttack = bonusAttack;
    }

    @Override
    double totalAttackPower() {
        return getAttackPower() + bonusAttack * getAttackPower();
    }

    public double getBonus() {
        return bonusAttack;
    }

    public void setBonus(double bonusAttack) {
        this.bonusAttack = bonusAttack;
    }
}

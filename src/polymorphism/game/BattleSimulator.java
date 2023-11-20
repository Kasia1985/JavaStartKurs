package polymorphism.game;

public class BattleSimulator {
    static void fight(Team team1, Team team2) {
        double team2Energy = attack(team1, team2);
        double team1Energy = attack(team2, team1);
        double energyDiff = team1Energy - team2Energy;
        if (energyDiff > 0) {
            System.out.println("Won Team " + team1.getName() + " with the advantage " + energyDiff + " of power");
        } else if (energyDiff < 0) {
            System.out.println("Won Team " + team2.getName() + " with the advantage " + (-energyDiff) + " of power");
        } else {
            System.out.println("Draw, both teams save " + team1Energy + " energy");
        }
    }

    private static double attack(Team attacker, Team defender) {
        double attack = attacker.attack();
        double defense = defender.defense();
        double attackPower = attack - defense;
        double energy = defender.energy();
        if (attackPower > 0) {
            double result = energy - attackPower;
            return result >= 0 ? result : 0;
        } else {
            return energy;
        }
    }
}

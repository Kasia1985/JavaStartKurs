package polymorphism.game;

import com.sun.jdi.connect.AttachingConnector;

public class GameSimulator {
    public static void main(String[] args) {
        Attacker attacker1 = new Attacker("Joe", 100,100,100,0.2);
        Attacker attacker2 = new Attacker("Bob", 100,100,100,0.2);
        Defender attacker3 = new Defender("Martha", 100,100,100,0.2);
        Attacker attacker4 = new Attacker("Martha", 100,100,100,0.2);
        Attacker attacker5 = new Attacker("Kris", 100,100,100,0.2);
        Defender attacker6 = new Defender("Kate", 100,100,100,0.2);

        Team team1 = new Team("TeamOne", attacker1, attacker2, attacker3);
        Team team2 = new Team("TeamTwo", attacker4, attacker5, attacker6);
        BattleSimulator.fight(team1,team2);

    }
}

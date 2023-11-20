package polymorphism.game;

public class Team {
    private String name;
    private GameCharacter[] characters = new GameCharacter[3];

    public Team(String name, GameCharacter character1, GameCharacter character2, GameCharacter character3) {
        this.name = name;
        characters[0] = character1;
        characters[1] = character2;
        characters[2] = character3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GameCharacter[] getCharacters() {
        return characters;
    }

    public void setCharacters(GameCharacter[] characters) {
        this.characters = characters;
    }

    double attack() {
        double attack = 0;
        for (GameCharacter character : characters) {
            attack += character.totalAttackPower();
        }
        return attack;
    }

    double defense() {
        double defense = 0;
        for (GameCharacter character : characters) {
            defense += character.totalDefensePower();
        }
        return defense;
    }

    double energy() {
        double energy = 0;
        for (GameCharacter character : characters) {
            energy += character.getEnergy();
        }
        return energy;
    }
}

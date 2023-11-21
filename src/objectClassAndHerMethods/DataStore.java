package objectClassAndHerMethods;

public class DataStore {
    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private int compNumbers;

    void add(Computer computer){
        if(compNumbers < MAX_COMPUTERS){
            computers[compNumbers] = computer;
            compNumbers++;
        }else{
            System.out.println("Max number of computers has been reached");
        }
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[compNumbers];
        for (int i = 0; i < compNumbers; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    public int checkAvailability(Computer computer){
        int amount = 0;
        if(computer == null)
            return 0;
        for (int i = 0; i < compNumbers; i++) {
            if(computer.equals(computers[i]))
                amount++;
        }
        return amount;
    }
}

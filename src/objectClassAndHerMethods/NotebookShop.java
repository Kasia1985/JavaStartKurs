package objectClassAndHerMethods;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("Dell", 555));
        dataStore.add(new Computer("Apple", 2023));
        dataStore.add(new Computer("Acer", 456));
        dataStore.add(new Computer("Asus", 654));
        dataStore.add(new Computer("Dell", 555));

        Computer compToFind = new Computer("Dell", 555);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Numbers of computers " + compToFind + ": " + computersFound);

        System.out.println("All computers:");
        for (Computer computer: dataStore.getComputers()) {
            System.out.println(computer);
        }
    }
}

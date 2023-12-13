package fileExercises.exercise2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ClientExplorer {
    public static void main(String[] args) {
        final String fileName = "clients.csv";
        try {
            Client[] clients = ClientDataReader.readFile(fileName);
            printMostValuableClient(clients);
            String country = readCountryFromUser();
            printClientsFromCountry(clients, country);
            printAvgValueFromCountry(clients, country);
        } catch (FileNotFoundException e) {
            System.out.println("No file named " + fileName);
        }
    }

    private static void printAvgValueFromCountry(Client[] clients, String country) {
        double totalValue = 0;
        int clientsFromCountryCounter = 0;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                totalValue += client.getClientValue();
                clientsFromCountryCounter++;
            }
        }
        if(totalValue>0){
            double avgValue = totalValue / clientsFromCountryCounter;
            System.out.printf("The average value of a customer from %s is %.2f", country, avgValue);
        }
    }

    private static void printClientsFromCountry(Client[] clients, String country) {
        System.out.println("Clients from country " + country + ":");
        boolean atLeastOneClient = false;
        for (Client client : clients) {
            if (country.equals(client.getCountry())) {
                System.out.println(client);
                atLeastOneClient = true;
            }
        }
        if (!atLeastOneClient) {
            System.out.println("No Clients from " + country);
        }
    }

    private static String readCountryFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the country from which you are interested in customers:");
        return scanner.nextLine();
    }

    private static void printMostValuableClient(Client[] clients) {
        Client mostValuableClient = clients[0];
        for (Client client : clients) {
            if (client.getClientValue() > mostValuableClient.getClientValue()) {
                mostValuableClient = client;
            }
        }
        System.out.println("Most value client: " + mostValuableClient);
    }
}

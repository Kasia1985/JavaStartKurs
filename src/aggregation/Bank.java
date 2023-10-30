package aggregation;

public class Bank {
    public static void main(String[] args) {

        // created first person
        Person person1 = new Person();
        person1.firstName = "Jon";
        person1.lastName = "Kowalski";
        person1.idNr = "575748493945";

        // created second person
        Person person2 = new Person();
        person2.firstName = "Kate";
        person2.lastName = "Johnson";
        person2.idNr = "8593405078785";

        //created address
        Address address1 = new Address();
        address1.street = "Wodna";
        address1.houseNr = "22a";
        address1.flatNr = 5;
        address1.zipCode = 10333;
        address1.city = "Poznan";

        /*
        created third person and new address where sie is register.
        at the same time he is living at the same address as person 1
         */
        Person person3 = new Person();
        person3.firstName = "Sebastian";
        person3.lastName = "Burton";
        person3.idNr = "85473648785";
        person3.registered = new Address();
        person3.registered.street = "Hauptstrasse";
        person3.registered.houseNr = "21";
        person3.registered.flatNr = 1;
        person3.registered.zipCode = 10771;
        person3.registered.city = "Berlin";
        person3.living = address1;

        // bank account for 1st person
        BankAccount account1 = new BankAccount();
        account1.owner = person1;
        account1.balance = 10_000;
        

        // bank account for 2nd person
        BankAccount account2 = new BankAccount();
        account2.owner = person2;
        account2.balance = 30_000;

        // 2nd person living and is registered at the same address
        person2.living = address1;
        person2.registered = address1;

        // bank account for 3rd person
        BankAccount account3 = new BankAccount();
        account3.owner = person3;
        account3.balance = 50_000;

        System.out.println("Person nr 2:");
        System.out.println(person2.firstName + " " + person2.lastName);
        System.out.println("living in : " + person2.living.city);
        System.out.println("and have bank account with amount of:" + account2.balance);
        System.out.println("Person nr 3:");
        System.out.println(person3.firstName + " " + person3.lastName);
        System.out.println("living in : " + person3.living.city);
        System.out.println("and have bank account with amount of:" + account3.balance);

        //longer way to create
        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000;
        credit1.cashReturned = 0;
        credit1.interestRate = 0.10;
        credit1.termMonth = 12;
        System.out.println("Person nr 1:");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.idNr);
        System.out.println("have bank account with amount of:" + account1.balance);
        System.out.println("and credit on " + credit1.cashBorrowed);
    }
}
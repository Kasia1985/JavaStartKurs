package dataType;

public class Variable {

    public static void main(String[] args) {

        String brand = "Mercedes";
        String model = "180M";
        int year = 2020;
        double price = 300000;
        String color = "black";

        System.out.println("I bought " + brand + " model: " + model + " in my favourite " + color + " color, year " + year + " for " + price + " euro");

        //find errors:
        String url = "http://javastart.pl";
        url = "https://javastart.pl";
        System.out.print("The website where I learn Java is: ");
        System.out.println(url);

        int kevinYear = 1990;
        System.out.print("Home Alone was released in:");
        System.out.println(kevinYear);

        var voterTurnout = 58.0;
        //var voterTurnout = 58d;  you can also just add "d" at the end and var knows that it has to be double
        voterTurnout = 61.1;
        System.out.print("The percentage turnout during the last elections was: ");
        System.out.println(voterTurnout);
    }
}

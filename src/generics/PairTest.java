package generics;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(153, "Sebastian");
        Pair<Double, Double> p2 = new Pair<>(153.5, 5.5);
        Pair<String, String> p3 = new Pair<>("Home", "Cat");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    private static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("<" + pair.getT() + "; " + pair.getV() + ">");
    }
}

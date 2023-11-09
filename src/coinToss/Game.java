package coinToss;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        CoinToss coinToss = new CoinToss();
        coinToss.betResult();
        coinToss.flipCoin();
        coinToss.showResult();

    }
}

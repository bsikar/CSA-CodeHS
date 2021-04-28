public class CoinTester {
    public static void main(String[] args) {
       Coins coins = new Coins(4, 3, 2, 1); // 1.41
       coins.bankValue();
       coins.addPenny(); // 1.42, 11 coins
       coins.addQuarter(); // 1.67 12 coins
       coins.addQuarter(); // 1.92 13 coins
       coins.addDime(); // 2.02 14 coins
       coins.addDime(); // 2.12 15 coins
       coins.bankCount();
       coins.bankValue();
    }
}

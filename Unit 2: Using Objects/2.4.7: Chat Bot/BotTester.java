import java.util.Scanner;

public class BotTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello. What is your name? What's the weather like?");
        Bot bot = new Bot(input.nextLine());
        bot.greeting();
        bot.help();
        bot.weather();
        System.out.println("How many feet in a mile?");
        bot.feetInMile();
        bot.goodbye();
    }
}

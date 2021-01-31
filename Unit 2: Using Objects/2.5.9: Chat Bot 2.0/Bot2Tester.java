import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
        
       //Start Here!
        Scanner input = new Scanner(System.in);
        Bot2 bot = new Bot2(input.nextLine());
        bot.greeting();
        System.out.println("What is your favorite animal?");
        bot.favoriteAnimal(input.nextLine());
        bot.home(input.nextLine());
        bot.favoriteNumber(input.nextInt());
        bot.goodbye();
    }
}

import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
       System.out.println("Enter player one's name:");
       String player1Name = input.nextLine();
       System.out.println("Enter player two's name:");
       String player2Name = input.nextLine();
       System.out.println("Enter " + player1Name + "'s score");
       int player1Score = input.nextInt();
       System.out.println("Enter " + player2Name + "'s score");
       int player2Score = input.nextInt();
     
       if (!(player1Name.compareTo(player2Name) > 0)) {
           System.out.println(player1Name + " scored " + player1Score + " points");
           System.out.println(player2Name + " scored " + player2Score + " points");
       } else {
           System.out.println(player2Name + " scored " + player2Score + " points");
           System.out.println(player1Name + " scored " + player1Score + " points");
       }
       
       if (player1Score > player2Score) {
           System.out.println(player1Name + " wins!");
       } else {
           System.out.println(player2Name + " wins!");
       }
        
    }
}

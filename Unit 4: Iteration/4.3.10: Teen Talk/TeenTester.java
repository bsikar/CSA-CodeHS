import java.util.Scanner;

public class TeenTester {
    public static void main(String[] args) {
        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10, true);
        System.out.println(myFriend.toString());

        Scanner input = new Scanner(System.in);

        System.out.println(myFriend.teenTalk(input.nextLine()));
    }
}

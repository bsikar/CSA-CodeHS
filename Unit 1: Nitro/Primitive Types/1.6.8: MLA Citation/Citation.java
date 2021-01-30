import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name': ");
        String a = input.nextLine();
        System.out.println("Enter the title of the book: ");
        String b = input.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String c = input.nextLine();
        System.out.println("Enter the year the book was published: ");
        String d = input.nextLine();
        System.out.println(a + ". " + b + ".\n" + c + ", " + d + '.');
    }
}

public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       // between 0 and 60

       int seconds = (int) ((double)Math.random() * 60);
       // Print the number of seconds
       System.out.println("Microwaving for " + seconds + " seconds");
       // Use two if statements to print
       if (seconds <= 20) {
           System.out.println("Perfect cooking time!");
       } else {
           System.out.println("Your roll will catch fire!");
       }
       // whether the roll is fine or will catch fire
    }
}

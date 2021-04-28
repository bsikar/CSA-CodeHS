public class MicrowaveCooking {
    public static void main(String[] args) {
       int seconds = (int) (Math.random() * 60);
       System.out.println("Microwaving for " + seconds + " seconds");
       if (seconds <= 20) {
           System.out.println("Perfect cooking time!");
       } else {
           System.out.println("Your roll will catch fire!");
       }
    }
}

public class RaceMain
{
    public static void main(String[] args)
    {
        double distance = 2414;
        
        Racecar car1 = new Racecar(Math.round(Math.random())+1, "First");

        Racecar car2 = new Racecar(Math.round(Math.random())+1, "Second");


        System.out.println(car1.toString() + " finished in " + car1.computeTime(distance) + " seconds");

        System.out.println(car2.toString() + " finished in " + car2.computeTime(distance) + " seconds");
        
    }
}

public class DistanceTester {
    public static void main(String[] args) {
        Distance karelAndSchool = new Distance(5);
        Distance karelAndPark = new Distance(10);
        Distance karelAndBFF = new Distance(12);
        System.out.println(karelAndSchool.toYards() + "\n" + karelAndPark.toKilometers() + "\n" + karelAndBFF.toFeet());
    }
}

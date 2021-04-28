public class UnitCircle {
    public static void main(String[] args) {
        System.out.println("Radians: (cos, sin)");
        System.out.println((double)0 + ": " + Math.round(Math.cos(0) * 100) / 100.0 + ", " + Math.round(Math.sin(0) * 100) / 100.0);
        System.out.println(Math.PI / 2 + ": " + Math.round(Math.cos(Math.PI / 2) * 100) / 100.0 + ", " + Math.round(Math.sin(Math.PI / 2) * 100) / 100.0);
        System.out.println(Math.PI + ": " + Math.round(Math.cos(Math.PI) * 100) / 100.0 + ", " + Math.round(Math.sin(Math.PI) * 100) / 100.0);
    }
}

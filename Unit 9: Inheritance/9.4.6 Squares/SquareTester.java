public class SquareTester {
    public static void main(String[] args) {
        Square square = new Square(12);
        System.out.println(square);
        System.out.println(square.area());
        square.setSideLength(20);
        System.out.println(square);
        System.out.println(square.area());
    }
}


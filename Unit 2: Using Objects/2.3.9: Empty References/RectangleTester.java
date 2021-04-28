public class RectangleTester {
    public static void main(String[] args) {
        Rectangle brick = new Rectangle(1,1);
        Rectangle fencePost = new Rectangle(1, 3);

        System.out.println(brick);
        System.out.println(fencePost);

        fencePost = new Rectangle(1, 5);
        System.out.println(fencePost);
    }
}

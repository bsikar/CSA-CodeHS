public class DogTester {
    public static void main(String[] args) {
        Dog dog = new Dog("quiet dog");
        System.out.println(dog.speak());
        System.out.println(dog);

        LoudDog loudDog = new LoudDog("loud dog");
        System.out.println(loudDog.speak());
        System.out.println(loudDog);
    }
}

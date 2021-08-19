public class LoudDog extends Dog {
    public LoudDog(String name) {
       super(name);
    }

    @Override
    public String speak() {
        return "BARK!";
    }

    @Override
    public String toString() {
        return super.getName() + " is loud and likes to " + speak();
    }
}


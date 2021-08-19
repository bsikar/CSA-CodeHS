import java.util.ArrayList;

public class PieTester {
    public static void main(String[] args) {
        Pie pie = new Pie("berry", 8);
        PumpkinPie pumpkinPie = new PumpkinPie(10, true);
        ApplePie applePie = new ApplePie(12);

        System.out.println(pie);
        System.out.println(pumpkinPie);
        System.out.println(applePie);
    }
}

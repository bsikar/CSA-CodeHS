public class ArrayAverage {
   private int[] values;

   public ArrayAverage(int[] theValues) {
      values = theValues;
   }

   public double getAverage() {
     int x = 0;
     for (int i : values) {
        x += i;
     }
     return (double) x / values.length;
   }
}

public class Forecast {
    public Forecast() {
   }

   public static double futureValue(double var0, double var2, int var4) {
      return var4 == 0 ? var0 : futureValue(var0 * (1.0 + var2), var2, var4 - 1);
   }
}

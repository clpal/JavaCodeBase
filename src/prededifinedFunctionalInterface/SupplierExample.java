package prededifinedFunctionalInterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double>integerSupplier=()->Math.random();
      double v=  integerSupplier.get();
        System.out.printf(""+v);
    }



}

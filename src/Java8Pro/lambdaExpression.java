package Java8Pro;

import java.util.function.IntFunction;

public class lambdaExpression {
    public static void main(String[] args) {
   Add add= (int a) -> a*a+2;
  int a= add.sum(3);
        System.out.println(a);
    }
}

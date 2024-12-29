package Test;
@FunctionalInterface
interface Square{
    int calculate(int x);
}
public class Test1 {
    public static void main(String[] args) {
         Square square= (int x)->x*x;



       int a= square.calculate(5);
       System.out.println(a);
    }
}

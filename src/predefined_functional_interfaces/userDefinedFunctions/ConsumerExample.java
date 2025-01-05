package predefined_functional_interfaces.userDefinedFunctions;

import java.util.function.Consumer;
// accept ,and then
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer>print=num->System.out.println(num);
        print.accept(10);
    }
}

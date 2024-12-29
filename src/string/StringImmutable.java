package string;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

// Even if we "modify" s1, s2 remains unaffected
        s1 = s1.concat(", World!");

        System.out.println(s1); // Output: "Hello, World!"
        System.out.println(s2); // Output: "Hello"

    }
}

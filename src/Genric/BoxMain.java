package Genric;

public class BoxMain {
    public static void main(String[] args) {
        Box integerBox = new Box<>(100);
        integerBox.displayContent();

        Box doubleBox = new Box<>(100.01);
        doubleBox.displayContent();

        Box stringBox = new Box<>("Hello");
        stringBox.displayContent();
    }
}

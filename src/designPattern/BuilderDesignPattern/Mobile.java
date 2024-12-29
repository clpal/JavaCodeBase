package designPattern.BuilderDesignPattern;

public class Mobile {
    private int ram;
    private String brand;
    private String os;
    private int storage;

    public Mobile(int ram, String brand, String os, int storage) {
        this.ram = ram;
        this.brand = brand;
        this.os = os;
        this.storage = storage;
    }


    @Override
    public String toString() {
        return "Mobile{" +
                "ram=" + ram +
                ", brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}

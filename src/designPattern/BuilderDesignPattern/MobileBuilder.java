package designPattern.BuilderDesignPattern;

public class MobileBuilder {
    private int ram;
    private String brand;
    private String os;
    private int storage;

    /*public MobileBuilder(int ram, String brand, String os, int storage) {
        this.ram = ram;
        this.brand = brand;
        this.os = os;
        this.storage = storage;
    }*/



    public MobileBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public MobileBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public MobileBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public MobileBuilder setStorage(int storage) {
        this.storage = storage;
        return  this;
    }
    // Build method to create the final product
    public  Mobile build(){
        return new  Mobile(ram,brand,os,storage);
    }
}

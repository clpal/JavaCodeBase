package designPattern.BuilderDesignPattern;

public class MobileBuilderMain {
    public static void main(String[] args) {
          // Mobile mobile=new MobileBuilder(2,"android","android-12",128).build();
           Mobile mobile=new MobileBuilder().setRam(1).setBrand("android").build();
           //Mobile mobile1=new MobileBuilder(2,"android","android-12",128).setBrand("redmi0").setRam(8).build();
        System.out.println(mobile.toString());
        //System.out.println(mobile1.toString());
    }
}

package designPattern.designsingleton;
//Eager initialization
public class EagerInitializedSingleton {
    private  static final EagerInitializedSingleton instnace=new EagerInitializedSingleton();
   private EagerInitializedSingleton(){

    }
   public static EagerInitializedSingleton getInstance(){
        return  instnace;
    }
}

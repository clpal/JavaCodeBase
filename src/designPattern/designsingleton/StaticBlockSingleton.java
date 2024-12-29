package designPattern.designsingleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;
    private  StaticBlockSingleton(){

    }
    // static block initialization for exception handling
static {
        try {
            instance=new StaticBlockSingleton();

        }
        catch ( Exception e){
            throw new RuntimeException("Exception occurred in creating singleton class");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}

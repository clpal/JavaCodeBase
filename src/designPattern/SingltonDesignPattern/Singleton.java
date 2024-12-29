package designPattern.SingltonDesignPattern;

public class Singleton {
    /*  ### Method 1 Easy Initialization
    No need to implement getInstance() method. Instance can be accessed directly
    public  static Singleton singleton=new Singleton();

    */
   /*
    ### Method 1 Easy Initialization
    No need to implement getInstance() method. Instance can be accessed directly

     public  static  Singleton singleton;
      static {
          singleton =new Singleton();
      }*/
    private volatile static  Singleton singleton;
   private Singleton(){

    }

     /* synchronized  public static Singleton getInstance() {
        if (singleton==null){
            singleton= new Singleton();
        }
        return  singleton;
    }*/
// double checking thread safe
    public static Singleton getSingleton() {
        if (singleton==null)
            synchronized (Singleton.class){
                if (singleton == null) {
                    singleton=new Singleton();
                }
            }
        return singleton;
    }
}

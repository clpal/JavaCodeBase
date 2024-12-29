package designPattern.designsingleton;

import javax.naming.Context;

public class SingletonManager {
    private Context context;
    private  static  SingletonManager instance= null;
    private  SingletonManager(Context _context){
           this.context=_context;
    }

    public static synchronized SingletonManager getInstance(Context mContext) {
         if (instance==null){
             instance=new SingletonManager(mContext);
         }
        return instance;
    }
}

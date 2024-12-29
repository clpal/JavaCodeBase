package opps;

abstract class  AbsA{

abstract void add(int a, int b);
  abstract   void sub(int a, int b);



        }
        class Demo extends AbsA{
       void add(int a, int b){

        System.out.println( a +b);
        }
         void sub(int a, int b){

             //super.sub(a,b);
             System.out.println( "child"+(a-b));
            }
        }


public class MainClass{

    public static void main(String []args){

        AbsA a=new Demo();//
        Demo a1=new Demo();
        a.sub(6,4);
        //a1.sub(8,5);

       // a1.add(4,5);
        a.add(4,5);

    }
}

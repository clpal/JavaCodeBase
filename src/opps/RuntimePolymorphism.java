package opps;

class A{
   int print(int a,int b ){
       return  a+b;
    }
}
class B extends  A{
    int print(int a,int b ){
        return  a+b;
    }
}
public class RuntimePolymorphism {
    public static void main(String[] args) {
        A a= new B();
        B a1= new B();


       int sum = a.print(1,2);
        System.out.println(sum);
        int sum1= a1.print(2,3);
        System.out.println(sum1);

    }

}

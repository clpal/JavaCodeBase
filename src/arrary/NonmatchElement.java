package arrary;
// esko check krnan hai
public class NonmatchElement {
    public static void main(String[] args) {

      int a[]={1,3,5,6,7,8};
        int b[]= {1,3,8};
         int c[]=new int[a.length];
         int count=0;
        for (int i = 0; i <a.length ; i++){
        for (int j = 0; j < b.length ; j++) {
            if (b[j] != a[i])
                c[count++] =a[i];
        }}
        for (int i = 0; i <count ; i++) {
            System.out.println(c[i]);
        }



    }
}

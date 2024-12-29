package Test;
// iterator approach bruth force
// recurssion approach
// start/end shift index

public class AnarameStrin {
    public static void main(String[] args) {
        String str="dog";
        String newstr="";
        String str1="god";
        char ch[]=str.toCharArray();
        for (int i = ch.length-1; i <0 ; i--) {
            newstr += ch[i];

        }
        if (newstr.equals(str1)) {
            System.out.println("Anarame");

        }
        else{
            System.out.println(" Not Anarame");
        }
    }
}

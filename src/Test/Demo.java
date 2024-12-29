package Test;

public class Demo {
      int arr[]={3,4,7,8,0,1,3,4,3,7,4};

       // 3 --> 4
    // 4--> 2
    //7 -->2
    // so on...
       // frequency count of element


    public static void getDublicateCountFreqency(int arr[]){
        int freq[]=new int[arr.length];
        boolean frequency=false;
        int count=1;
        int j = 0;
        for (int i = 0; i <arr.length ; i++) {

            for (int J = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]) {
                  count ++;
                }
                if (count>1) {
                    frequency=true;
                    freq[i]=arr[i];

                }
                frequency=false;
            }

        }
        for (int i = 0; i <freq.length ; i++) {
             System.out.println(" Element is"+ freq[i]+ "count" + count);

        }

    }
    public static void main(String[] args) {
        int arr[]={3,4,7,8,0,1,3,4,3,7,4};
        getDublicateCountFreqency( arr);

    }

}

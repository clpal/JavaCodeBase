package arrary;
import java.util.*;


public class MaxOccurance {
    public static void main(String[] args) {
      int[] arr= new int[]{5,2,0,7,12,2,5,4,8,33,2};
      
      printMaxOccrance(arr);
  }
  
  public static void printMaxOccrance(int[] arr){
    int length= arr.length;
    int max=0;
    
    for (int i=0;i<length; i++) {
      if (arr[i]>max){
        max = arr[i];
      } 
    }
    int[] arr2= new int[max+1];
    
    for (int i=0; i<arr2.length; i++) {
       arr2[i]=0;  
    }
    
    for (int i=0;i<length; i++){ 
       arr2[arr[i]]++;
    }
    
    
    max=0;
    int maxIndex=0;
    for (int i=0;i<arr2.length; i++){ 
      if (arr2[i]>max){
        max = arr2[i];
        maxIndex=i;
      } 
    }
     System.out.println("max occurance element "+maxIndex);
    
  }
}
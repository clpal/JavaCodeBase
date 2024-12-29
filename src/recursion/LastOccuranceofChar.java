package recursion;



class LastOccuranceofChar {
	static int ans=-1;
    public static void main(String[] args) {
      char x='g';
  String str="tdabcddedgr";
  
   lastOccLTR(str,x,0,ans);
   //lastOccRTL(str,x,str.length()-1,ans);
  
 System.out.println(ans);
    }
    static void lastOccLTR(String str,char x,int i,int _ans){
    	
    	//base case
         if(i>=str.length()){
  return ;
}
         // solve ek case
      if(str.charAt(i)==x) {
    	  
        ans=i;
      
      }
// Recurrence sabhal lega
lastOccLTR(str,x,i+1,_ans);

    }
    
  static void lastOccRTL(String str,char x,int i,int _ans){
    	
    	//base case
         if(i<0){
  return ;
}
         // solve ek case
      if(str.charAt(i)==x) {
    	  
        ans=i;
        return;
      
      }
// Recurrence sabhal lega
      lastOccRTL(str,x,i-1,_ans);

    }
}

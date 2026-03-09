package module6_7;

public class maxsumKA {
  public static void main(String[] args){
    int arr[]={-2 , 3,-1 , 5 , -4};
    int cursum=0;
    int maxsum=arr[0];
    for(int i=0;i<arr.length;i++){
      cursum=cursum+arr[i];
      if(cursum>maxsum){
        maxsum=cursum;
      }
      if(cursum<0){
        cursum=0;

      }
      }
      System.out.println("maximum subarray sum="+maxsum);
      
    }
  }
  


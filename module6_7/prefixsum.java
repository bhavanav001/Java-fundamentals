package module6_7;

public class prefixsum {
  public static void main(String[] args)
{
  int arr[]={10,20,30,40,50,60};
  int n= arr.length;
 int[] prefix=new int[n];
 prefix[0]=arr[0];
for(int i=1;i<n;i++){
  prefix[i]=prefix[i-1]+ arr[i];
}
int L=2,R=4;
int rangesum;
if(L==0){
  rangesum=prefix[R];
}else{
  rangesum=prefix[L]-prefix[L-1];
}
System.out.println(rangesum);
}

  }



import java.util.Scanner;
class CupCakes{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int testCases=sc.nextInt();
int packed,leftOver;
int arr[]=new int[testCases];
for(int i=0;i<testCases;i++){
   arr[i]=sc.nextInt();
}
for(int i=0;i<testCases;i++){
if(arr[i]==2||arr[i]==1)
 System.out.println(arr[i]);
else{
   packed=(arr[i]/2)+1;
   leftOver=arr[i]-packed;
System.out.println(leftOver);
}
}
}
}
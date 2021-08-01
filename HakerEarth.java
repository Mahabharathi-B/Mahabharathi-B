import java.util.Scanner;
class HakerEarth{
//find how to minimize
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int k=sc.nextInt();
int a;
    int arr[]=new int[N];
    for(int i=0;i<N;i++){
   arr[i]=sc.nextInt();
}
for(int m=0;m<N;++m){
for(int j=m+1;j<N;++j){
if(arr[m]<arr[j]){
 a=arr[m];
 arr[m]=arr[j];
arr[j]=a;
}
}
}
//N=3,k=2,arr[3]={26,23,20}:output=23
 System.out.println(arr[k-1]);
 
}
 
}
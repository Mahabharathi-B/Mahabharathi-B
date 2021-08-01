import java.util.Scanner;
class Tripplets
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
int arr[]=new int[limit];
for(int i=0;i<limit;i++){
   arr[i]=sc.nextInt();
}
for(int i=0;i<limit;i++){
for(int j=i+1;j<limit;j++){
 for(int k=0;k<limit;k++){
   if((arr[i]+arr[j])==arr[k]){
 System.out.print(arr[k]+" ");    
}
}
}
}
}
}
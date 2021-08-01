import java.util.Scanner;
class Leaders
{
public static void main(String[] args){
int leader;
Scanner sc=new Scanner(System.in);
int limit=sc.nextInt();
int arr[]=new int[limit];
for(int i=0;i<limit;i++){
   arr[i]=sc.nextInt();
}
for(int i=0;i<limit;i++){
int max=0;
for(int j=i+1;j<limit;j++){
 if(arr[i]<arr[j])
max=1;
}
if(max==0)
  System.out.print(arr[i]+" ");
  
}
}
}
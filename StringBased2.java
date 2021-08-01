import java.util.Scanner;
public class StringBased2
{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int length=sc.nextInt();
   int arr[]=new int[100];
   
for(int i=0;i<length;i++){
   arr[i]=sc.nextInt();
}
 int result=solution(arr,length);
System.out.println(result);
}
public static int solution(int[] arr,int length){
 int f[]=new int[100];
  //int result[]=new int[100];
  int result=0,visited=-1;
for(int i=0;i<length;i++){
int count=1;
 for(int j=i+1;j<length;j++){
  if(arr[i]==arr[j]){
    count++;
    f[j]=visited;
}
}
if(f[i]!=visited)
 f[i]=count;
}
for(int i=0 ;i<length;i++){
  if((f[i]!=visited)&&(f[i]==arr[i])){
   if(result<f[i])
   result=f[i];
}
}

return result;
}
}
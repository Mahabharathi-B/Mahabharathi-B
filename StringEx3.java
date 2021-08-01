import java.util.Scanner;
import java.util.Arrays;
class StringEx3
{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 System.out.print("Input1:");
 int limit=sc.nextInt();
System.out.print("Input2:");
 int arr[]=new int[limit];
int value[]=new int[limit-1];
for(int i=0;i<limit;i++){
  arr[i]=sc.nextInt();
}
for(int i=0;i<limit-1;i++){
  value[i]=arr[i]-arr[i+1];
}
Arrays.sort(value);

  System.out.println(value[limit-2]);
}
}
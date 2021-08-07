import java.util.Scanner;
class Max{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int limit=sc.nextInt();
  int arr[]=new int[10];
int max=0,value;
  for(int i=0;i<limit;i++){
     arr[i]=sc.nextInt();
}
for(int i=0;i<limit;i++){
for(int j=i+1;j<limit;j++){
     value=arr[j]-arr[i];
     if(value>max)
       max=value;
}
}
System.out.println(max);
}
}
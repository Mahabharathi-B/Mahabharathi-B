import java.util.Scanner;
class MissingNum{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int check=sc.nextInt();
//int visited=-1;
  int arr[]=new int[n];
  for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
}
/*for(int j=0;j<n;j++){
 for(int i=j+1;i<n;i++){
  if(arr[j]==arr[i])
    arr[i]=visited;
 }
}
for(int i=0;i<n;i++){
if(arr[i]!=visited)
  System.out.print(arr[i]+" ");    
}*/
for(int j=0;j<n;j++){
 for(int i=j+1;i<n;i++){
  if(arr[i]+arr[j]==check)
    System.out.println(arr[j]+" "+arr[i]);
}
}
}
}
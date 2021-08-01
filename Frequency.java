import java.util.Scanner;
public class Frequency{
 public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[100]; 
    int[] f=new int[n];
    int visited=-1;
     for(int i =0;i<n;i++){
         arr[i]=s.nextInt();
}
      for(int i=0;i<n;i++){
        int count =1;
       for(int j=i+1;j<n;j++){
          if(arr[i]==arr[j]){
            count++;
            f[j]=visited;
}
}
if(f[i]!=visited)
   f[i]=count;
}

for(int i=0;i<f.length;i++){
    if(f[i]!=visited){
System.out.print(arr[i]+" "+f[i]);
}
System.out.println(" ");
}
}
}
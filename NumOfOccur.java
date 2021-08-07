import java.util.Scanner;
public class NumOfOccur{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int T=sc.nextInt();
   int arr[]=new int[T];
   for(int i=0;i<T;i++){
      arr[i]=sc.nextInt();
}
    for(int i=0;i<T;i++){
     System.out.println(occurance(arr[i]));
}
 }
static int occurance(int n){
   int count=0,rem;
    while(n>0){
      rem=n%10; 
      if(rem==4)
        count++;
      n=n/10;
}
return count;
}
}
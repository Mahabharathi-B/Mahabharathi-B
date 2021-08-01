import java.util.Scanner;
public class Paterson{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter a number");
 int num = sc.nextInt();
  if(isPaterson(num)){
    System.out.println("paterson");
   }else{
       System.out.println("not paterson");
  }
}
 static boolean isPaterson(int n){
   int num = n;
   int sum=0;
   while(n>0){
    int digit=n%10;
    sum +=fact(digit);
    n=n/10;
}
 return(sum==num);
}
static int fact(int k){
   int value = 1;
  for(int i=1;i<=k;i++){
      value=value*i; 
}
 return value;
}
}
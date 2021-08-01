import java.util.Scanner;
public class PrimeNum3{
  public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  System.out.print("enter a first number");
  int start = s.nextInt();
   System.out.print("enter a second number");
   int end = s.nextInt();
   System.out.print("prime number between "+start+" and " +end);
   for (int i=start;i<=end;i++){ 
     if(isPrime(i)){
       System.out.print(" "+i);
}
}
}
public static boolean isPrime(int n){
 if(n<=1){return false;}
  for (int i=2;i<Math.sqrt(n);i++){
  if(n%i==0){
 return false;
 }
  }
  return true;
}
}
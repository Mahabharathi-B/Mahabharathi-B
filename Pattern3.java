import java.util.Scanner;
public class Pattern3{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int limit = sc.nextInt();
   for(int i=0;i<limit;i++){
     for(int j = limit-i;j>0;j--){
      System.out.print(" ");
      } 
     for(int k =0;k<=i;k++){
       System.out.print("*");
     }
    System.out.println("");
}
}
}
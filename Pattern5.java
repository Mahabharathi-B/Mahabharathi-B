import java.util.Scanner;
public class Pattern5{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int limit = sc.nextInt();
   int space = limit-1;
   for(int i=1;i<=limit;i++){
     for(int j=1;j<=space;j++){
      System.out.print(" ");
}space--;
    for(int k=1;k<=i;k++){
    System.out.print("*");
}
System.out.println("");
}
}
}
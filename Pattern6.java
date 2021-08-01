import java.util.Scanner;
public class Pattern6{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int limit = sc.nextInt();
   for(int i=0;i<=limit-1;i++){
     for(int j=0;j<=i;j++){
      System.out.print(" ");
}
    for(int k=0;k<=limit-1-i;k++){
    System.out.print("* ");
}
System.out.println("");
}
}
}
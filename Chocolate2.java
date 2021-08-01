import java.util.Scanner;
class Chocolate2{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter total number of Chocolate: ");
      int totalChoco=sc.nextInt();
  //   while(totalChoco>0){
      System.out.print("Enter total number of Persons: ");
      int totalPersons=sc.nextInt();
      int chocolate=0;
      chocolate=totalChoco/totalPersons;
      System.out.println("For Each Person "+chocolate+" chocolates will be distributed");
     // totalChoco-=(chocolate*totalPersons);
//}
}
 
}
import java.util.Scanner;
class Chocolate{
public static void main(String[] args){
   int chocolate,rem;
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter number of persons:");
   int noOfPersons=sc.nextInt();
  System.out.print("Enter total available chocolates:");
   int totalChoco=sc.nextInt();
    System.out.print("Enter one chocolate rate:");
    int rate=sc.nextInt();
   for(int i=0;i<noOfPersons;i++){
    if(totalChoco>0){
     System.out.print("Enter amount of person "+(i+1)+":");
     int amount=sc.nextInt();
     chocolate=amount/rate;
     if(chocolate>totalChoco){
    
     System.out.println("only "+ totalChoco+" is available");
}else{
     rem=amount%rate;
     if(rem>0)
      System.out.println(rem +" remaining amount");
     totalChoco=totalChoco-chocolate;
     System.out.println(chocolate+" chocolates");
      
}
}
  else{
   System.out.println("out of stack");
 break;
      }
}

}
}
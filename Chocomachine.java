import java.util.Scanner;
class Chocomachine{
    public static void main(String[] args) {
        int chocolate;
        Scanner sc=new Scanner(System.in);
        int numberOfChoco=sc.nextInt();
        int prizeOfChoco=sc.nextInt();
        while(numberOfChoco>0){
        System.out.println("HOw Much Money You Have?:");
        int amount=sc.nextInt();
         chocolate=amount/prizeOfChoco;

        numberOfChoco=numberOfChoco-chocolate;
       System.out.println(chocolate);
    }
if(numberOfChoco==0)
System.out.println("out of stack");
}
}
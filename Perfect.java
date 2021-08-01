import java.util.Scanner;
public class Perfect
{
    public static void main(String[] args){
        int flag=0;
        Scanner s= new Scanner(System.in);
        int lowLimit=s.nextInt();
        int upLimit=s.nextInt();
        if(lowLimit>0&&upLimit>0){
            for(int i=lowLimit;i<=upLimit;i++){
                if(isPerfectNum(i)){
                    System.out.println(i);
                    flag=1;
                }
            }
        if(flag==0)
            System.out.println("-1");
        }
        else
           System.out.println("Invalid Input");
    }
    static boolean isPerfectNum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if((n%i)==0){
                sum=sum+i;
            }
        }
        if(n==sum)
            return true;
        else
           return false;
    }
}
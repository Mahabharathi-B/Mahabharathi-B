import java.util.Scanner;
public class HexaToDeci {
    public static void main(String[] args){
         Scanner hd=new Scanner(System.in);
         String value=hd.nextLine();
         getDecimal(value);
    }
        public static void getDecimal(String hex){  
        String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             long n=hex.length();
             long val = 0,k=0;  
             
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 long d = digits.indexOf(c);
                 for(int j=0;j<=15;j++){
                     if(j==d)
                        k++;
                }   
                val = 16*val + d; 
             }
            
           if(k==n)
           System.out.println(val);
           else
           System.out.println("Invalid Input");
}  
}
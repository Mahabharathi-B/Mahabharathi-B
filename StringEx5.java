import java.util.Scanner;
class StringEx5
{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String stringInput=sc.nextLine();
 String sum="",palindrome="",value1="";
    for(int i=0;i<stringInput.length();i++){
     String value=stringInput.substring(i);
    sum+=value;

 StringBuffer sum1=new StringBuffer(sum);
    sum1.reverse();
 String value2=sum1.toString();
   if(sum.equals(value2))
{
      palindrome+=sum;
}
else 
break;
}
System.out.println(palindrome);
}
}
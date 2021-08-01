import java.util.Scanner;
public class Toggle
{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String val=sc.nextLine();
  char array[]=val.toCharArray();
  for(int i=0;i<array.length;i++){
   if(array[i]>='a'&&array[i]<='z'){
     array[i]=(char)((int)array[i]-32);
   }
 else if(array[i]>='A'&&array[i]<='Z'){
array[i]=(char)((int)array[i]+32);
}
System.out.print(array[i]);
}
}
}
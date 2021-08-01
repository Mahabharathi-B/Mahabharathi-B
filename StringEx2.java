import java.util.Scanner;
class StringEx2
{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String value=sc.nextLine();
 char arr[]=value.toCharArray();
 for(int i=0;i<arr.length;i++){
  for(int j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j])
      arr[j]=' ';
}
}
for(int i=0;i<arr.length;i++){
if(arr[i]!=' ')
System.out.print(arr[i]);
}
}
}
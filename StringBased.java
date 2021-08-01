import java.util.Scanner;
public class StringBased
{
public static void main(String[] args){
char maxValue='0';  int max=1;
 Scanner sc=new Scanner(System.in);
 String value1=sc.nextLine();
//String value=value1.toLowerCase();(up value1)
String value=value1.trim();
 int length=value.length();
char arr[]=new char[length]; 
    int[] f=new int[length];
int visited=-1;
for(int i=0;i<length;i++){
arr[i]=value.charAt(i);
}
 for(int i=0;i<length;i++){
int count=1;
  for(int j=i+1;j<length;j++){
   if(arr[i]==arr[j]){
     count++;
f[j]=visited;
}
}
if(f[i]!=visited)
  f[i]=count;
}

for(int i=0;i<f.length;i++){
    if((f[i]!=visited)&&(f[i]>max)){
   max=f[i];
  maxValue=arr[i];
}
}
System.out.print(maxValue);
}
}

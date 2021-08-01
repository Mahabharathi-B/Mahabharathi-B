import java.util.Scanner;
class NoSeries {
   //input 4
   //output 2,10,30,68,....
   public static void main(String[] args){
         int i = 1;
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
 	for(; i <n; i/=1,i*=1 ,i++){
          //for(; i <n; i/=1 ,i*=1)
         // System.out.println(Math.pow(i,3)+i);   
          System.out.println((i*i*i)+i+",");
    }
   System.out.println((i*i*i)+i);
   sc.close();
 }
}
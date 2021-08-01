import java.util.Scanner;
class NoSeries2 {
    // 10,11,13,21,69,..
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n =  sc.nextInt();
     int start = 10,second = 11,diff = 1 , even = 2;
     System.out.print(start+","+second+",");
     for(int i = 3; i<= n; i++){
	diff = diff * even ;
        second = second + diff;
        System.out.print(second+",");
        even+=2;

      }
    }
}
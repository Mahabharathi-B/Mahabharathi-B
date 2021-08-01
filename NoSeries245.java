import java.util.Scanner;
class NoSeries245 {
	// 18,20,19,21,20,22,...
    public static void main (String[] args){
	int first = 18 ;
	int second , third ;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt() ;
	System.out.print(first);
	for (first=18;first<=n;first = third){
    	    second = first + 2 ;
	    third = second - 1 ;
	System.out.print(" "+second+" "+third);
            
    }

 }


}
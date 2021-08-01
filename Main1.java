public class Main1 {
   public static void main(String[] args) {
 	System.out.println(Math.max(13,34));
	System.out.println(Math.min(13,34));
	System.out.println((int)Math.sqrt(64)); 
	System.out.println(Math.sqrt(13));
	System.out.println(Math.abs(-14.5));
	System.out.println(Math.random());
	System.out.println((int)(Math.random() * 301));
	int value1 = 12 ,value2 = 13 ;
	if (value1>value2) 
	  System.out.println("condition1");
	else if(value1==value2) 
	  System.out.println("condition2");
	else 
	  System.out.println("both are not correct");
//ternary operator
        String result = (value1==value2) ? "good morning" : "good evening " ;
	System.out.println(result);
	int day = 14;
	switch (day) {
	  case 1 :
	     System.out.println("monday");
	     break;
          case 2 :
	     System.out.println("tuesday");
	     break;
	  case 3 :
	     System.out.println("wednesday");
             break;
          case 4 :
	     System.out.println("thursday");
	     break;
	  case 5 :
	     System.out.println("friday");
              break;
	  case 6 :
	     System.out.println("saturday");
	     break;
	  case 7 :
	     System.out.println("sunday");
	  default :
	      System.out.println("enter valid day !");
     } 
 }

} 